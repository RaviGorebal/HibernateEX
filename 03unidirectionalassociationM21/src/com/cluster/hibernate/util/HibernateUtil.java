package com.cluster.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	static SessionFactory sf = null;
	
	static{
		
		try{
			Configuration cfg = new Configuration().configure();
			sf = cfg.buildSessionFactory();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sf;
	}
}
