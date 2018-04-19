package com.cluster.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.cluster.entity.Employee;
import com.cluster.service.EmployeeService;

public class EmployeeAction extends DispatchAction {
	
	public ActionForward addEmployee(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest,
			HttpServletResponse pResponse) throws Exception {
		
		System.out.println("Inside addEmployee");
		EmployeeForm employeeForm = (EmployeeForm) pForm;
		Employee employee = EmployeeMapper.getEntityforEmployee(employeeForm);
		
		EmployeeService employeeService = new EmployeeService();
		employeeService.saveEmployee(employee);
		this.getAllEmployees(pMapping, pForm, pRequest, pResponse);
		return pMapping.findForward("displayAllEmployees");
	}
	
	public ActionForward getAllEmployees(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest,
			HttpServletResponse pResponse) throws Exception {
		
		System.out.println("Inside getAllEmployees");
		EmployeeListForm employeeListForm = new EmployeeListForm();
			
		EmployeeService employeeService = new EmployeeService();
		List<Employee> arlEmployee = employeeService.getAllEmployees();
		
		employeeListForm.setArlEmployee(arlEmployee);
		pRequest.setAttribute("EmployeeListForm", employeeListForm);
		return pMapping.findForward("displayAllEmployees");
	}
}
