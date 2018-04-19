package com.cluster.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.cluster.dao.entity.Employee;
import com.cluster.service.EmployeeService;

public class EmployeeAction extends DispatchAction{
	
	public ActionForward addEmployee(ActionMapping pActionMapping, ActionForm pActionForm,
			HttpServletRequest pHttpServletRequest, HttpServletResponse pHttpServletResponse) throws Exception {
		
		EmployeeForm employeeForm = (EmployeeForm)pActionForm;
		Employee employee = EmployeeMapper.getEntityforEmployee(employeeForm);
		EmployeeService employeeService = new EmployeeService();
		employeeService.addEmployee(employee);
		this.getAllEmployees(pActionMapping, pActionForm, pHttpServletRequest, pHttpServletResponse);
		return pActionMapping.findForward("displayAllEmployees");
	}
	
	public ActionForward getAllEmployees(ActionMapping pActionMapping, ActionForm pActionForm,
			HttpServletRequest pHttpServletRequest, HttpServletResponse pHttpServletResponse) throws Exception {
		
		EmployeeService employeeService = new EmployeeService();
		List<Employee> arlEmployee = employeeService.getAllEmployees();
		EmployeeListForm employeeListForm = new EmployeeListForm();
		employeeListForm.setArlEmployee(arlEmployee);
		pHttpServletRequest.setAttribute("EmployeeListForm", employeeListForm);
		return pActionMapping.findForward("displayAllEmployees");
	}

}
