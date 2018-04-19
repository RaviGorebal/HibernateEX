package com.cluster.hqljoin;

public class EmployeeAddress {
	
	private int employeeAddressId;
	private String addressLine1;
	private String addressLine2;
	private Employee employee;

	
	public int getEmployeeAddressId() {
		return employeeAddressId;
	}
	public void setEmployeeAddressId(int employeeAddressId) {
		this.employeeAddressId = employeeAddressId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
