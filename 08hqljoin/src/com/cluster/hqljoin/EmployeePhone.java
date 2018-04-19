package com.cluster.hqljoin;

public class EmployeePhone {
	
	private int employeePhoneId;
	private String telephone;
	private Employee employee;
	
	public int getEmployeePhoneId() {
		return employeePhoneId;
	}
	public void setEmployeePhoneId(int employeePhoneId) {
		this.employeePhoneId = employeePhoneId;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
