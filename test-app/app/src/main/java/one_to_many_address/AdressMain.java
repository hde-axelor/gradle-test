package one_to_many_address;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AdressMain {
	
	 public static void main(String []args) {
		  
		  Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory factory = cfg.buildSessionFactory();
			
			
			Owner o1 = new Owner();
			
			o1.setOwner_id(5);
			o1.setOwner_name("Rajesh");
			
			Adress a1 = new Adress();
			a1.setAdress_id(2);
			a1.setAdress_name("Moradabad");

			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			
			try {
				session.save(o1);
				session.save(a1);
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