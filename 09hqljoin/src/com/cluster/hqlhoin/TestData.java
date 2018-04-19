package com.cluster.hqlhoin;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

public class TestData {
	
	public void createTestData(Session session){
		
		// Creates new Employee 1
		Employee employee = new Employee();
		employee.setFirstName("Emp_1_FirstName");
		employee.setMiddleName("Emp_1_MiddleName");
		employee.setLastName("Emp_LastName_1");
		employee.setGender("M");
		employee.setEmailID("employee1@gmail.com");
		
		//Create new Employee 1's Address no 1
		EmployeeAddress employeeAddress1 = new EmployeeAddress();
		employeeAddress1.setAddressLine1("Emp_1_Add_1_Address_Line_1");
		employeeAddress1.setAddressLine2("Emp_1_Add_1_Address_Line_2");
		employeeAddress1.setCity("City1");
		employeeAddress1.setState("State1");
		employeeAddress1.setZipcode("Zipcode1");
		
		//Create new Employee 1's Address no 2
		EmployeeAddress employeeAddress2 = new EmployeeAddress();
		employeeAddress2.setAddressLine1("Emp_1_Add_2_Address_Line_1");
		employeeAddress2.setAddressLine2("Emp_1_Add_2_Address_Line_2");
		employeeAddress2.setCity("City2");
		employeeAddress2.setState("State2");
		employeeAddress2.setZipcode("Zipcode2");

		
		Set<EmployeeAddress> employeeAddresses =  new HashSet<EmployeeAddress>();
		employeeAddresses.add(employeeAddress1);
		employeeAddresses.add(employeeAddress2);

		employee.setEmployeeAddresses(employeeAddresses);
		
		employeeAddress1.setEmployee(employee);
		employeeAddress2.setEmployee(employee);
		
		//Creating Address Type
		AddressType addressType = new AddressType();
		addressType.setAddressTypeId(10);
		addressType.setEmployeeAddresses(employeeAddresses);
		
		employeeAddress1.setAddressType(addressType);
		employeeAddress2.setAddressType(addressType);
		
		//Create new Employee 1's Phone no. 1
		EmployeePhone employeePhone1 = new EmployeePhone();
		employeePhone1.setPhone("Emp_1_Tel_1");
		
		//Create new Employee 1's Phone no. 2
		EmployeePhone employeePhone2 = new EmployeePhone();
		employeePhone2.setPhone("Emp_1_Tel_2");

		Set<EmployeePhone> employeePhones =  new HashSet<EmployeePhone>();
		employeePhones.add(employeePhone1);
		employeePhones.add(employeePhone2);

		employee.setEmployeePhones(employeePhones);
		
		employeePhone1.setEmployee(employee);
		employeePhone2.setEmployee(employee);

		//Creating Phone Type
		PhoneType phoneType = new PhoneType();
		phoneType.setPhoneTypeId(10);
		phoneType.setEmployeePhones(employeePhones);
		
		employeePhone1.setPhoneType(phoneType);
		employeePhone2.setPhoneType(phoneType);

		session.beginTransaction();
		session.save(employee);
		session.beginTransaction().commit();

		
		
	}

}
