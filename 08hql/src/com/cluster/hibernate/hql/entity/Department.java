package com.cluster.hibernate.hql.entity;

import java.util.HashSet;
import java.util.Set;

public class Department {
	
	private int departmentId;
	private String departmentName;
	private String location;
	private Set<Employee> hsEmployee = new HashSet<Employee>();

	public Department(String departmentName, String location){
		this.departmentName = departmentName;
		this.location = location;
	}
	
	public Department(){
		
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Employee> getHsEmployee() {
		return hsEmployee;
	}

	public void setHsEmployee(Set<Employee> hsEmployee) {
		this.hsEmployee = hsEmployee;
	}
	


}
