package com.cluster.entity;

import java.io.Serializable;
import java.util.Set;

import com.cluster.entity.EmployeeAddress;
import com.cluster.entity.EmployeePhone;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String emailID;
	private Set<EmployeeAddress> employeeAddresses;
	private Set<EmployeePhone> employeePhones;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Set<EmployeeAddress> getEmployeeAddresses() {
		return employeeAddresses;
	}
	public void setEmployeeAddresses(Set<EmployeeAddress> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}
	public Set<EmployeePhone> getEmployeePhones() {
		return employeePhones;
	}
	public void setEmployeePhones(Set<EmployeePhone> employeePhones) {
		this.employeePhones = employeePhones;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
}
