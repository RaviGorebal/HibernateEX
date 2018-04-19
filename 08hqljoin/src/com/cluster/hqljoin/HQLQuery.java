/**
 * 
 */
package com.cluster.hqljoin;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author Jeetu
 *
 */
public class HQLQuery {
	
	/**
	 * This example is used to demonstrate get() Vs load() capabilities
	 * @param pEmployeeId
	 * @return
	 */
	
	public Employee getEmployee(int pEmployeeId){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Employee employee = (Employee)session.get(Employee.class, new Integer(pEmployeeId)); 
//		System.out.println("First name - " +  employee.getFirstName());
		session.close();
		return employee;
	}
	
	public List<Employee> getAllEmployees(){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String HQL_Query = "from Employee employee"; 
		Query query = session.createQuery(HQL_Query); 
		List<Employee> arlEmployee = query.list(); 
		session.close();
		return arlEmployee;
	}
	
	public List<Employee> getEmployeesUsingJoinFetch(){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String HQL_QUERY = "SELECT employee from " +
		" Employee employee LEFT OUTER JOIN FETCH employee.hsEmployeeAddress address " +
		" LEFT OUTER JOIN FETCH employee.hsEmployeePhone phone";
		Query query = session.createQuery(HQL_QUERY);
		List<Employee> arlEmployee = query.list();
		session.close();
		return arlEmployee;
	}
	
	public List<Object> getEmployeesUsingJoin(){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String HQL_QUERY = "SELECT employee.firstName, address.addressLine1, phone.telephone from " +
		" Employee employee LEFT OUTER JOIN employee.hsEmployeeAddress address " +
		" LEFT OUTER JOIN employee.hsEmployeePhone phone";
		Query query = session.createQuery(HQL_QUERY);
		List<Object> arlObject = query.list();
		session.close();
		return arlObject;
	}
	

	
	
}
