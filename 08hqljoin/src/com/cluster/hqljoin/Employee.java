package com.cluster.hqljoin;

import java.util.Set;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private Set<EmployeeAddress> hsEmployeeAddress;
	private Set<EmployeePhone> hsEmployeePhone;
	
	public Set<EmployeePhone> getHsEmployeePhone() {
		return hsEmployeePhone;
	}
	
	public void setHsEmployeePhone(Set<EmployeePhone> hsEmployeePhone) {
		this.hsEmployeePhone = hsEmployeePhone;
	}
	
	public Set<EmployeeAddress> getHsEmployeeAddress() {
		return hsEmployeeAddress;
	}
	
	public void setHsEmployeeAddress(Set<EmployeeAddress> hsEmployeeAddress) {
		this.hsEmployeeAddress = hsEmployeeAddress;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
