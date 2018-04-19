package com.cluster.hqlhoin;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
/*		TestData testData = new TestData();
		testData.createTestData(session);
*/		
/*		String SQL_QUERY = "FROM Employee employee"; 
	 	Query query = session.createQuery(SQL_QUERY);
	 	Iterator it = query.list().iterator();
		while(it.hasNext()){
			Employee employeePhone = (Employee)it.next();
		}*/

		
/*		Employee employee = (Employee)session.get(Employee.class, new Integer(8));
		System.out.println("employee name - " + employee.getFirstName());
		Iterator<EmployeePhone> it = employee.getEmployeePhones().iterator();
		while(it.hasNext()){
			EmployeePhone employeePhone = (EmployeePhone)it.next();
			System.out.println("Phone -  " + employeePhone.getPhone());
			
			PhoneType phoneType = employeePhone.getPhoneType();
			System.out.println("Phone type - " +phoneType.getType());
		}*/
		
		String SQL_QUERY = "SELECT employee.firstName, address.addressLine1, phone.phone FROM Employee employee " +
				"LEFT OUTER JOIN employee.employeeAddresses address LEFT OUTER JOIN employee.employeePhones phone"; 
		
	 	Query query = session.createQuery(SQL_QUERY);
	 	Iterator it = query.list().iterator();
//	 	Iterator it = query.iterate();
	 	System.out.println("FIRST NAME  " + "LAST NAME");
	 	while(it.hasNext()){
	 		Object[] row = (Object[]) it.next();
	 		System.out.println(row[0] + "       " + row[1] + "  "+ row[2]);
	 	//	System.out.println(employee.getFirstName() );
	 	}
	 	
/*		String SQL_QUERY = "SELECT employee FROM Employee employee " +
		"JOIN employee.employeePhones phone where employee.firstName = 'Emp_1_FirstName'"; 
		Query query = session.createQuery(SQL_QUERY);
	//	query.setParameter(0, "Emp_1_FirstName");
		Employee employee = (Employee)query.uniqueResult();
	//	Iterator it = query.list().iterator();
	//	Iterator it = query.iterate();
	//	System.out.println("FIRST NAME  " + "LAST NAME");
		System.out.println("employee name - " + employee.getFirstName());
	
		Iterator<EmployeePhone> it = employee.getEmployeePhones().iterator();

		while(it.hasNext()){
			EmployeePhone employeePhone = (EmployeePhone)it.next();
			System.out.println("Phone -  " + employeePhone.getTelephone());
			
			PhoneType phoneType = employeePhone.getPhoneType();
			System.out.println("Phone type - " +phoneType.getType());
		}*/

	}
}
