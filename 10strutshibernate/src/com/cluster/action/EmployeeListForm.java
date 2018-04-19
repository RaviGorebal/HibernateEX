package com.cluster.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.cluster.entity.Employee;

public class EmployeeListForm extends ValidatorForm{
	
	private List<Employee> arlEmployee = new ArrayList<Employee>();
	private int employeeId;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public List<Employee> getArlEmployee() {
		return arlEmployee;
	}

	public void setArlEmployee(List<Employee> arlEmployee) {
		this.arlEmployee = arlEmployee;
	}
}
