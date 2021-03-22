package com.demo.validation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	  public static void main(String []args) {
		  
		  Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory factory = cfg.buildSessionFactory();
			
			Employee e1 = new Employee();
			
			e1.setEmp_id(1);
			e1.setName("Rajesh");
			
			
			e1.setEmail("rajesh5@gmail.com");
			
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			
			try {
				session.save(e1);
				tx.commit(); 
			} catch (Exception ex) {
				tx.rollback();
				System.out.println("Exception occurred while saving data: " + ex.getMessage());
				ex.printStackTrace();
			} finally {
				factory.close();
			} 

		  
	  }
}
