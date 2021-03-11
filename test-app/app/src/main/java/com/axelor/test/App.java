/*
 * This Java source file was generated by the Gradle 'init' task.
 */


package com.axelor.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Student st = new Student();
		st.setId(106);
		st.setName("Harshit");
		st.setCity("Banglore");
		System.out.println(st);

		//ADDRESS OBJECT
		
		Address ad = new Address();
		ad.setStreet("Street");
		ad.setCity("Moradabad");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(656753);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(st);
		session.save(ad); 
	    tx.commit();
	    session.close();
		
		
  
	}
}
