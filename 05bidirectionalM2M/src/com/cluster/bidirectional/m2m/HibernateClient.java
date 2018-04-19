package com.cluster.bidirectional.m2m;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateClient {

	public static void main(String args[]) {

		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();

		Student student1 = new Student("Student1");
		Student student2 = new Student("Student2");
		Student student3 = new Student("Student3");

		Address address1 = new Address("560010");
		Address address2 = new Address("560040");
		Address address3 = new Address("560030");
		
		Set<Student> hsStudent = new HashSet<Student>();
		hsStudent.add(student1);
		hsStudent.add(student2);
		hsStudent.add(student3);
		address1.setHsStudent(hsStudent);
		session.save(address1);
		
		transaction.commit();
		session.close();
		
		Session session1 = sessionFactory.openSession();
		session1.beginTransaction().begin();
		student1 = (Student)session1.load(Student.class, new Integer(2));

		Set<Address> hsAddress = new HashSet<Address>();
		hsAddress.add(address1);
		hsAddress.add(address2);
		hsAddress.add(address3);
		student1.setHsAddress(hsAddress);
		session1.saveOrUpdate(student1);
		session1.beginTransaction().commit();
		

		System.out.println("Done !!!!");
	}
}
