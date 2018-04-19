package com.cluster.hibernate.association.bidirectional.one2manymany2one;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.cluster.hibernate.util.HibernateUtil;

public class HibernateClient {
	
/*	static{
		BasicConfigurator.configure();
	}
*/	
	public static void main(String args[]){
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		trans.begin();
		
		Student student1 = new Student("Student1");
		Address address1 = new Address("560010");
		Address address2 = new Address("560040");
		
		Set<Address> hsAddress =  new HashSet<Address>();
		hsAddress.add(address1);	
		hsAddress.add(address2);
		student1.setHsAddress(hsAddress);  
		
		address1.setStudent(student1);
		address2.setStudent(student1);

		session.save(student1);
		
		session.save(address1);
		session.save(address2);		
		
		trans.commit(); 
		System.out.println("Done !!!!");
/*		
			
		Student student=(Student) session.load(Student.class, new Integer(2));
		session.delete(student);
		trans.commit(); */
/*		System.out.println(student.getStudentName());
		 		 
		Set address = student.getAddresses();
		Iterator i = address.iterator();
			while(i.hasNext()){
				Address add =(Address)i.next();
				System.out.println(add.getZipCode());
			}
*/	
/*		Address address = (Address)session.load(Address.class, new Integer(1));
		System.out.println("Zip code (child) - " + address.getZipCode());
		Student student = address.getStudent();
		System.out.println("Student name (parent)- " + student.getStudentName());
		
*/		
	}
}
