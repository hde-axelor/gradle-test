package com.axelor.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {
	
	public static void main(String []args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student student=(Student)session.get(Student.class,1);
		System.out.println(student);
		
		tx.commit();
		session.close();
		
		
	}

}
