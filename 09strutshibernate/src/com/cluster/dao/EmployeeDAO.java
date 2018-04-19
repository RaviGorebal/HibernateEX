package com.cluster.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cluster.entity.Employee;

public class EmployeeDAO {
	
	public void addEmployee(Employee pEmployee){
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(pEmployee);
		session.beginTransaction().commit();
	
	}
	
	public List<Employee> getAllEmployees(){
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		String HQL_QUERY = "FROM Employee";
		return session.createQuery(HQL_QUERY).list();
	
	}

}
