package com.axelor.map_many_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		//creating instance of employeee
		
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.setEmp_id(20);
		e1.setEmp_name("RAM");
		
		e2.setEmp_id(21);
		e2.setEmp_name("Iyina shumonova");
		
		List<Emp> list1 = new ArrayList<Emp>();
				list1.add(e1);
		        list1.add(e2);
		
		
		//creating instance of projects
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setProject_id(40);
		p1.setProject_name("Liberary Management");

		p2.setProject_id(41);
		p2.setProject_name("Chatbot");
		
		List<Project> list2 = new ArrayList<Project>();
		
		list2.add(p1);
		list2.add(p2);
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		  session.save(list2);
		  session.save(list2);
		
		tx.commit();
		session.close();
		factory.close();
		
		
		
	}

}
