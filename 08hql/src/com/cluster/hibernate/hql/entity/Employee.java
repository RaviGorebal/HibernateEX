package com.cluster.hibernate.hql.entity;

import java.util.Date;

public class Employee {
	
	private int employeeId;
	private String ename;
	private String job;
	private Date hireDate;
	private double salary;
	private Double commission;
	private Department department;

	
	public Employee(String ename, String job, Date hireDate, double salary, Double commission){
		this.ename = ename;
		this.job = job;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commission = commission;
	}

	
	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Double getCommission() {
		return commission;
	}


	public void setCommission(Double commission) {
		this.commission = commission;
	}


	public Employee(String ename, String job, Date hireDate, double salary){
		this.ename = ename;
		this.job = job;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public Employee(){
		
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}


}
