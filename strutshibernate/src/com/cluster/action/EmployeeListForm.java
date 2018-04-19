package com.cluster.action;

import java.util.ArrayList;
import java.util.List;

import com.cluster.dao.entity.Employee;

public class EmployeeListForm {
	
	private List<Employee> arlEmployee = new ArrayList<Employee>();

	public List<Employee> getArlEmployee() {
		return arlEmployee;
	}

	public void setArlEmployee(List<Employee> arlEmployee) {
		this.arlEmployee = arlEmployee;
	}

}
