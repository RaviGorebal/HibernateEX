package com.cluster.service;

import java.util.List;

import com.cluster.dao.EmployeeDAO;
import com.cluster.dao.entity.Employee;

public class EmployeeService {
	
	public void addEmployee(Employee pEmployee){
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.addEmployee(pEmployee);
		
	}
	
	
	public List<Employee> getAllEmployees(){
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.getAllEmployees();
		
	}

}
