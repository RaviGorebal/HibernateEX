package com.cluster.hqljoin;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 HQLQuery hqlQuery = new HQLQuery();
		 
/*		 // Example 1
		 Employee employee = hqlQuery.getEmployee(1); 
//		 System.out.println("First name - " +  employee.getFirstName());
*/
		 
/*		 // Example 2
		 List<Employee> arlEmployee = hqlQuery.getAllEmployees();
		 Iterator<Employee> iterator = arlEmployee.iterator(); 
		 while (iterator.hasNext()) { 
			 Employee employee = (Employee) iterator.next(); 
			 System.out.println("Name - " + employee.getFirstName()); 
			 Iterator<EmployeeAddress> it = employee.getHsEmployeeAddress() .iterator(); 
			 while (it.hasNext()) {
				 EmployeeAddress employeeAddress = (EmployeeAddress) it.next();
				 System.out.println("Address - " + employeeAddress.getAddressLine1());
		 	} 
		 }*/
/*		 
		 // Example 3
		 List<Employee> arlEmployee = hqlQuery.getEmployeesUsingJoinFetch();
 		 Iterator<Employee> iterator = arlEmployee.iterator(); 
 		 while (iterator.hasNext()) { 
 			 Employee employee = (Employee) iterator.next(); 
 			 System.out.println("Name - " + employee.getFirstName()); 
			 Iterator<EmployeeAddress> it = employee.getHsEmployeeAddress() .iterator(); 
			 while (it.hasNext()) {
				 EmployeeAddress employeeAddress = (EmployeeAddress) it.next();
				 System.out.println("Address - " + employeeAddress.getAddressLine1());
		 	} 
		 }*/		 
		 
		// Example 4 
		List<Object> arlObject =  hqlQuery.getEmployeesUsingJoin();
		Iterator it = arlObject.iterator();
		while (it.hasNext()) {
			Object[] row = (Object[]) it.next();
			System.out.println(row[0] + "       " + row[1] + "       " + row[2]);
		}
	
		

	}

}
