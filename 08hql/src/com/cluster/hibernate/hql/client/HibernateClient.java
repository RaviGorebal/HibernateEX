package com.cluster.hibernate.hql.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateClient {
	
/*	static{
		BasicConfigurator.configure();
	}*/
	public static void main(String args[]){
		
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
/*		CreateData createData = new CreateData();
		createData.createDeptEmployeeData(trans, session);
*/
	 	HQLQuery hqlQuery =  new HQLQuery(session);
	// 	hqlQuery.fromClause1();
	//	hqlQuery.whereClause();
	//	hqlQuery.groupByClause();
	 	hqlQuery.equiJoin();
	  	trans.commit(); 
	//	QueryByCriteria qbc = new QueryByCriteria();
	//	qbc.queryByCriteria(trans, session);
	//	qbc.qbcWithEqualToRestrictions(trans, session);
	//	qbc.qbcWithNotEqualToRestrictions(trans, session);
	//	qbc.qbcLikeSimpleExpression(trans, session);
	//	qbc.qbcWithGreaterThanRestrictions(trans, session);
	//	qbc.qbcOrAndLogicalExpresssion(trans, session);
	//	qbc.qbcDisjunction(trans, session);
	//	qbc.qbcConjunction(trans, session);
		
/*		QueryByExample qbe =  new QueryByExample();
		qbe.queryByExample(trans, session);*/
		System.out.println("Done !!!!");
		
	}
}
