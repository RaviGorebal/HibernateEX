package com.cluster.hibernate.association.bidirectional.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cluster.hibernate.util.HibernateUtil;

public class HibernateClient {
	
	public static void main(String args[]){
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		trans.begin();

		
 		Student student1 = new Student("Student1");
		Address address1 = new Address("560010");
		student1.setAddress(address1);
		address1.setStudent(student1);
		session.save(address1);
		session.save(student1);
		


/*	
		Student student = (Student) session.load(Student.class, new Integer(1));
		System.out.println("Student Name - " + student.getStudentName());
		Address address = student.getAddress();
		System.out.println("Zipcode - " + address.getZipCode());
			 
*/
/*		Address address = (Address) session.load(Address.class, new Integer(1));
		System.out.println("Zipcode - " + address.getZipCode());
		Student student = address.getStudent();
		System.out.println("Student Name - " + student.getStudentName());
*/						 
		trans.commit(); 
		
		System.out.println("Done !!!!");
		
	}
}
