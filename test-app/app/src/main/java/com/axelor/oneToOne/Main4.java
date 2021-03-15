package com.axelor.oneToOne;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main4 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		System.out.println(factory);

		// instance of Question class

		Question qu = new Question();
		qu.setQuestion_id(200);
		qu.setQuestion("What is java");
		
		Question qu1 = new Question();
		qu1.setQuestion_id(2002);
		qu1.setQuestion("What is ORM");
		

		// Instance of Answer

		Answers answer = new Answers();
		answer.setAnswer_id(302);
		answer.setAnswer("Java is a Programming Language");
		answer.setQuestion(qu);
		qu.setAnswer(answer);
		
		Answers answer1 = new Answers();
		answer.setAnswer_id(302);
		answer.setAnswer("Object Relational Mapping");
		answer.setQuestion(qu1);
		qu1.setAnswer(answer1);
		
		
      
		System.out.println(answer);
		//Set answer to a question
		qu.setAnswer(answer);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		try {

			session.save(qu);
			session.save(answer);
			
			session.save(qu1);
			session.save(answer1);
			tx.commit();
		} catch (Exception ex) {
			System.out.println("Exception occurred while saving data: " + ex.getMessage());
			ex.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
			factory.close();
		}
		 
   }
}
