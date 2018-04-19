package com.cluster.entity;

import java.util.Set;

public class PhoneType {
	
	private int phoneTypeId;
	private String type;
	private Set<EmployeePhone> employeePhones;
	
	
	public int getPhoneTypeId() {
		return phoneTypeId;
	}
	public void setPhoneTypeId(int phoneTypeId) {
		this.phoneTypeId = phoneTypeId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Set<EmployeePhone> getEmployeePhones() {
		return employeePhones;
	}
	public void setEmployeePhones(Set<EmployeePhone> employeePhones) {
		this.employeePhones = employeePhones;
	}


}
