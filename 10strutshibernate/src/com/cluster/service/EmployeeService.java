package com.cluster.service;

import java.util.List;

import com.cluster.dao.EmployeeDAO;
import com.cluster.entity.Employee;

public class EmployeeService {

	public boolean saveEmployee(Employee pEmployee) {
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.addEmployee(pEmployee);
		
		return true;
	}
	
	public List<Employee> getAllEmployees(){
		
		EmployeeDAO employeeDAO =  new EmployeeDAO();
		return employeeDAO.getAllEmployees();
		 
	}
	
	public void deleteEmployee(int pEmployeeId) {
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.deleteEmployee(pEmployeeId);
	}
	
	public Employee getEmployee(int pEmployeeId) {
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO.getEmployee(pEmployeeId);
	}
}
