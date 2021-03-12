package com.axelor.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

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
		qu.setQuestion_id(201);
		qu.setQuestion("What is ORM");
		

		// Instance of Answer

		Answers answer = new Answers();
		answer.setAnswer_id(302);
		answer.setAnswer("Java is a Programming Language");
		
		Answers answer1 = new Answers();
		answer.setAnswer_id(302);
		answer.setAnswer("Object Relational Mapping");
		
      
		System.out.println(answer);
		//Set answer to a question
		qu.setAnswer(answer);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(qu);
		session.save(answer);
		
		session.save(qu1);
		session.save(answer1);

		tx.commit();
		 
		   Question newq = (Question)session.get(Question.class, 200);
		   System.out.println(newq.getQuestion());
		   System.out.println(newq.getAnswers().getAnswer_id());
		
		session.close();
		factory.close();
	}
}
