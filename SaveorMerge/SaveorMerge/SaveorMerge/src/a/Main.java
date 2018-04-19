package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {
	public static void main(String args[]) {

		SessionFactory sf = new AnnotationConfiguration().configure()
				.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		UserDetails details = new UserDetails();
		details.setUserId(5);
		details.setUserName("Java");

//		session.save(details);
 //        session.saveOrUpdate(details);
        UserDetails details2=(UserDetails) session.get(UserDetails.class, 3);
	    details2.setUserName("komal"); 
        session.merge(details2);

		System.out.println(" done ! ..");
		session.getTransaction().commit();
		session.close();
		
		 

	}
}
