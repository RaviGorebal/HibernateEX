package com.cluster.hibernate.basic;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cluster.hibernate.util.HibernateUtil;

public class HibernateClient {
	
/*	static{
		BasicConfigurator.configure();
	}
*/	
	static Logger log = Logger.getLogger("HibernateClient.class");
	
	public static void main(String args[]){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
			
				//CREATING records
 		Student student1 = new Student("ravi","ravig@gmail.com", "9740976916");
 		transaction.begin();
		session.save(student1);
		transaction.commit();
		//session.close();
		System.out.println("Student's ID  :- " + student1.getSid());
			
 		//LOADING / READING records
//		Student student = (Student)session.load(Student.class, new Integer(2));
//		System.out.println(student);
//		System.out.println("Student name - " + student.getSname());
//		System.out.println("Student's Id - " + student.getSid());
//		System.out.println("Student's email id - " + student.getEmail());
//		System.out.println("Student's phone no. - " + student.getPhoneno());
		
		
		//UPDATING record
//		Student student123 = (Student)session.load(Student.class, new Integer(2));
//		
//		transaction.begin();
//		student123.setPhoneno("1234567890");
//		session.update(student123);
//		transaction.commit();
//		System.out.println(student123);
		
		
		//DELETING record
//		Student studentwer = (Student)session.load(Student.class, new Integer(2));
//		transaction.begin();
//		session.delete(studentwer);
//		transaction.commit();
		
		session.close();
		System.out.println("Done !!!!");
		
	}
}
