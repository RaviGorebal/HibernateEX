/*
 * LoginMapper
 * @author  	cluster
 * @version 	7.00 sep 04, 2009
 *
 * Copyright (c) 2009 Cluster Software Solutions,
 * Rajajinagar, Bangalore 560010. All rights reserved.
 *
 * The use of this source code is only permitted with the explicit permission
 * of the legal owner.
 */
package com.cluster.action;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.cluster.entity.Employee;
import com.cluster.entity.EmployeeAddress;
import com.cluster.entity.EmployeePhone;
import com.cluster.entity.AddressType;
import com.cluster.entity.PhoneType;

/**
 * This mapper is used for move the values from Login Form to Login entity and vice versa.
 */
public class EmployeeMapper {
	/**
	 * This method moves the values from Login form to Login entity for creation.
	 * @param pLoginForm 		The input Login form with the UI values.
	 * @return Login			The Login entity with the values from UI set.
	 */
	public static Employee getEntityforEmployee(final EmployeeForm pEmployeeForm) {
		
		final Employee employee = new Employee();
		
		employee.setFirstName(pEmployeeForm.getFirstName());
		employee.setMiddleName(pEmployeeForm.getMiddleName());
		employee.setLastName(pEmployeeForm.getLastName());
		employee.setGender(pEmployeeForm.getGender());
		employee.setEmailID(pEmployeeForm.getEmailID());
		
		EmployeeAddress employeePermanentAddress = new EmployeeAddress();
		employeePermanentAddress.setAddressLine1(pEmployeeForm.getPermanentAddressLine1());
		employeePermanentAddress.setAddressLine2(pEmployeeForm.getPermanentAddressLine2());
		employeePermanentAddress.setCity(pEmployeeForm.getPermanentCity());
		employeePermanentAddress.setState(pEmployeeForm.getPermanentState());
		employeePermanentAddress.setZipcode(pEmployeeForm.getPermanentZipcode());
		
		EmployeeAddress employeePresentAddress = new EmployeeAddress();
		employeePresentAddress.setAddressLine1(pEmployeeForm.getPresentAddressLine1());
		employeePresentAddress.setAddressLine2(pEmployeeForm.getPresentAddressLine2());
		employeePresentAddress.setCity(pEmployeeForm.getPresentCity());
		employeePresentAddress.setState(pEmployeeForm.getPresentState());
		employeePresentAddress.setZipcode(pEmployeeForm.getPresentZipcode());
		
		Set<EmployeeAddress> employeeAddresses =  new HashSet<EmployeeAddress>();
		employeeAddresses.add(employeePermanentAddress);
		employeeAddresses.add(employeePresentAddress);
		
		employee.setEmployeeAddresses(employeeAddresses);
		employeePermanentAddress.setEmployee(employee);
		employeePresentAddress.setEmployee(employee);
		
		//Creating Address Type
		AddressType permanentAddressType = new AddressType();
		permanentAddressType.setAddressTypeId(10);
		
		AddressType presentAddressType = new AddressType();
		presentAddressType.setAddressTypeId(20);

		permanentAddressType.setEmployeeAddresses(employeeAddresses);
		presentAddressType.setEmployeeAddresses(employeeAddresses);
		
		employeePermanentAddress.setAddressType(permanentAddressType);
		employeePresentAddress.setAddressType(presentAddressType);
		
		EmployeePhone employeeHomePhone = new EmployeePhone();
		employeeHomePhone.setPhone(pEmployeeForm.getHomePhone());
		
		EmployeePhone employeeMobilePhone = new EmployeePhone();
		employeeMobilePhone.setPhone(pEmployeeForm.getMobilePhone());
		
		EmployeePhone employeeOfficePhone = new EmployeePhone();
		employeeOfficePhone.setPhone(pEmployeeForm.getOfficePhone());
		
		Set<EmployeePhone> employeePhones =  new HashSet<EmployeePhone>();
		employeePhones.add(employeeHomePhone);
		employeePhones.add(employeeMobilePhone);
		employeePhones.add(employeeOfficePhone);
		
		employee.setEmployeePhones(employeePhones);
		
		employeeHomePhone.setEmployee(employee);
		employeeMobilePhone.setEmployee(employee);
		employeeOfficePhone.setEmployee(employee);
		
		//Creating Phone Type
		PhoneType homePhoneType = new PhoneType();
		homePhoneType.setPhoneTypeId(30);
		
		PhoneType mobilePhoneType = new PhoneType();
		mobilePhoneType.setPhoneTypeId(40);

		PhoneType officePhoneType = new PhoneType();
		officePhoneType.setPhoneTypeId(10);

		homePhoneType.setEmployeePhones(employeePhones);
		mobilePhoneType.setEmployeePhones(employeePhones);
		officePhoneType.setEmployeePhones(employeePhones);
		
		employeeHomePhone.setPhoneType(homePhoneType);
		employeeMobilePhone.setPhoneType(mobilePhoneType);
		employeeOfficePhone.setPhoneType(officePhoneType);

		return employee;
	}
	
	
	public static EmployeeForm getFormforEmployee(final Employee pEmployee) {
		
		final EmployeeForm employeeForm = new EmployeeForm();
		
		employeeForm.setFirstName(pEmployee.getFirstName());
		employeeForm.setMiddleName(pEmployee.getMiddleName());
		employeeForm.setLastName(pEmployee.getLastName());
		employeeForm.setGender(pEmployee.getGender());
		employeeForm.setEmailID(pEmployee.getEmailID());
		
		Set<EmployeeAddress> hsEmployeeAddress = pEmployee.getEmployeeAddresses();
		Iterator<EmployeeAddress> addressIterator = hsEmployeeAddress.iterator();
		while(addressIterator.hasNext()){
			
			EmployeeAddress pEmployeeAddress = addressIterator.next();
			if(pEmployeeAddress.getAddressType().getAddressTypeId() == 10){
				employeeForm.setPermanentAddressLine1(pEmployeeAddress.getAddressLine1());
				employeeForm.setPermanentAddressLine2(pEmployeeAddress.getAddressLine2());
				employeeForm.setPermanentCity(pEmployeeAddress.getCity());
				employeeForm.setPermanentState(pEmployeeAddress.getState());
				employeeForm.setPermanentZipcode(pEmployeeAddress.getZipcode());
			}else if(pEmployeeAddress.getAddressType().getAddressTypeId() == 20){
				employeeForm.setPresentAddressLine1(pEmployeeAddress.getAddressLine1());
				employeeForm.setPresentAddressLine2(pEmployeeAddress.getAddressLine2());
				employeeForm.setPresentCity(pEmployeeAddress.getCity());
				employeeForm.setPresentState(pEmployeeAddress.getState());
				employeeForm.setPresentZipcode(pEmployeeAddress.getZipcode());
			}
		}
		
		Set<EmployeePhone> hsEmployeePhone = pEmployee.getEmployeePhones();
		Iterator<EmployeePhone> phoneIterator = hsEmployeePhone.iterator();
		while(phoneIterator.hasNext()){
			
			EmployeePhone pEmployeePhone = phoneIterator.next();
			if(pEmployeePhone.getPhoneType().getPhoneTypeId() == 10){
				employeeForm.setOfficePhone(pEmployeePhone.getPhone());
			}else if(pEmployeePhone.getPhoneType().getPhoneTypeId() == 30){
				employeeForm.setHomePhone(pEmployeePhone.getPhone());
			}else if(pEmployeePhone.getPhoneType().getPhoneTypeId() == 40){
				employeeForm.setMobilePhone(pEmployeePhone.getPhone());
			}
	
		}
		return employeeForm;
	}
}