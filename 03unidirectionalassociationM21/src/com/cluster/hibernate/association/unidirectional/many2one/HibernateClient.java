package com.cluster.hibernate.association.unidirectional.many2one;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cluster.hibernate.util.HibernateUtil;

public class HibernateClient {
	
/*	static{
		BasicConfigurator.configure();
	}*/

	public static void main(String args[]){
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		trans.begin();
		Student student1 = new Student("Sudent1");
		Address address1 = new Address("560010");
		student1.setAddress(address1);
		session.save(address1);
		session.save(student1);
		
		Student student2 = new Student("Sudent2");
		student2.setAddress(address1);
		session.save(student2);
		
		Student student3 = new Student("Sudent3");
		Address address2 = new Address("560040");
		student3.setAddress(address2);
		session.save(address2);
		session.save(student3);

		Student student4 = new Student("Sudent4");
		student4.setAddress(address2);
		session.save(student4);
		
		trans.commit();
		
/*		
		Student student = (Student) session.load(Student.class, new Integer(1));
		System.out.println("Student name - " + student.getStudentName());
		Address address = student.getAddress();
		System.out.println("Zip code - " + address.getZipCode());
*/
/*		Address address = (Address)session.load(Address.class, new Integer(1));
		System.out.println(address.getZipCode());
		 */
		
		System.out.println("Done !!!!");
		
	}
}






