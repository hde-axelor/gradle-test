package com.axelor.m2o;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainclass {
	
		public static void main(String[] args)
		{
			
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory factory = cfg.buildSessionFactory();
			
			//create owner instance
		Owner user = new Owner(); 

		 //create a vehicle entity
		Car car = new Car();
		Car car1 = new Car(); 

		car.setVehicleName("bmw"); 
		car.setUser(user); 

		car1.setVehicleName("Audi");
		car.setUser(user);
		user.setUserName("harshit deol"); 


		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		try {
			session.save(car);
			session.save(car1);
			session.save(user);
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
