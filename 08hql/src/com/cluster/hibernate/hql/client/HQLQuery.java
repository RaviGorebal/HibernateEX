package com.cluster.hibernate.hql.client;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.cluster.hibernate.hql.entity.Department;
import com.cluster.hibernate.hql.entity.Employee;

public class HQLQuery {
	
	private Session session;
	
	public HQLQuery(Session session){
		this.session = session;
	}
	
	public void fromClause1(){
		
	 	String HQL_QUERY = "FROM Department";
	 	
	 	Query query = session.createQuery(HQL_QUERY);
	 	List<Department> arlDepartment = query.list();
	 	Iterator<Department> it = arlDepartment.iterator();
//	 	Iterator it = query.iterate();
	 	System.out.println("Department " + "Location");
	 	while(it.hasNext()){
	 		Department department = (Department)it.next();
	 		System.out.println(department.getDepartmentName() + "       " + department.getLocation());
	 	}
	}
	
	/**
	 * HQL Query using FROM clause
	 * 
	 * @param session
	 */
	
	public void fromClause(){
		
	 	String HQL_QUERY = "FROM Employee";
	 	
	 	Query query = session.createQuery("FROM Employee");
	 	List<Employee> arlEmployee = query.list();
	 	Iterator<Employee> it = arlEmployee.iterator();
//	 	Iterator it = query.iterate();
	 	System.out.println("EMPLOYEE NAME  " + "JOB");
	 	while(it.hasNext()){
	 		Employee employee = (Employee)it.next();
	 		System.out.println(employee.getEname() + "       " + employee.getJob());
	 	}
	}
	
	/**
	 * 
	 * 
	 */
	public void whereClause(){
		
		String SQL_QUERY = "SELECT employee.ename, employee.job " +
				"FROM Employee employee WHERE job = 'MANAGER'";
	 	Query query = session.createQuery(SQL_QUERY);
	 	List<Object> arlObject = query.list();
	 	Iterator<Object> it = arlObject.iterator();
		while(it.hasNext()){
	 		Object[] object = (Object[]) it.next();
	 		System.out.println(object[0] + "       " + object[1] );
/*	 		Employee employee =  new Employee();
	 		employee.setEname((String)row[0]);
	 		System.out.println(employee.getEname());
*/	 	}
	}

	
	/**
	 * 
	 * 
	 */
	public void groupByClause(){
			
		String SQL_QUERY ="select job, avg(salary) " +
				"from Employee group by job";
		Query query = session.createQuery(SQL_QUERY);
	 	List empList = query.list();
	 	Iterator it = empList.iterator();
		while(it.hasNext()){
	 		Object[] row = (Object[]) it.next();
	 		System.out.println(row[0] + "       " + row[1]);
	 	}
	}
	
	
	/**
	 *
	 * 
	 */
	
	public void equiJoin(){

/*		String SQL_QUERY ="SELECT emp.ename, emp.job, dept.departmentName, dept.location " +
				"FROM Employee emp JOIN emp.department dept"; */
/*		String SQL_QUERY ="SELECT emp.ename, emp.job, dept.departmentName, dept.location " +
		"FROM Department dept left JOIN dept.hsEmployee emp";  
*/				/*String SQL_QUERY ="select emp.ename, emp.job, dept.departmentName, dept.location " +
		"from Employee emp JOIN emp.department dept"; */
		
/*		String HQL_QUERY = "SELECT e.ename, e.job, d.departmentName, d.location " +
		" FROM Employee e JOIN e.department d";
*/		
		String HQL_QUERY = "SELECT e.ename, e.job, d.departmentName, d.location " +
		" FROM Department d JOIN d.hsEmployee e";

		Query query = session.createQuery(HQL_QUERY);
		Iterator<Object> iterator = query.list().iterator();
		while(iterator.hasNext()){
			Object[] row = (Object[]) iterator.next();
			System.out.println(row[0] + "       " + row[1]+ "       " + row[2]+ "       " + row[3]);
		}
	}

}















