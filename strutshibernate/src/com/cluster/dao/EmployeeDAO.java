package com.cluster.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cluster.dao.entity.Employee;
import com.cluster.util.HibernateUtil;

public class EmployeeDAO {
	
	public void addEmployee(Employee pEmployee){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		session.save(pEmployee);
		transaction.commit();
		session.close();
		
		
	}
	
	public List<Employee> getAllEmployees(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Employee");
		List<Employee> arlEmployee = query.list();
		return arlEmployee;	
	}

}
