package com.cluster.dao.entity;

import java.util.Set;

public class AddressType {
	
	private int addressTypeId;
	private String type;
	private Set<EmployeeAddress> employeeAddresses;
	
	
	public int getAddressTypeId() {
		return addressTypeId;
	}
	public void setAddressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Set<EmployeeAddress> getEmployeeAddresses() {
		return employeeAddresses;
	}
	public void setEmployeeAddresses(Set<EmployeeAddress> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}
	

}
