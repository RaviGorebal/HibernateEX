package com.cluster.hqlhoin;

public class EmployeePhone {
	
	private int employeePhoneId;
	private String phone;
	private Employee employee;
	private PhoneType phoneType;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public PhoneType getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}
	public int getEmployeePhoneId() {
		return employeePhoneId;
	}
	public void setEmployeePhoneId(int employeePhoneId) {
		this.employeePhoneId = employeePhoneId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
