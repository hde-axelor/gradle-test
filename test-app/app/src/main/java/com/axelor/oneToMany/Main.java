package com.axelor.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		// instance of school
        School sch = new School();
        sch.setSchool_id(1);
        sch.setSchool_name("DPS School");

		// instance of student

		Student1 st = new Student1();
		
		st.setStudents_id(10);
		st.setStudents_name("Raghav");
		st.setSchool(sch);

		Student1 st1 = new Student1();
		st1.setStudents_id(10);
		st1.setStudents_name("Raghav");
		st.setSchool(sch);

		Student1 st2 = new Student1();
		st2.setStudents_id(10);
		st2.setStudents_name("Raghav");
		st.setSchool(sch);

		List<Student1> ls = new ArrayList<Student1>();
		ls.add(st);
		ls.add(st1);
		ls.add(st2);

		sch.setSchool_name("ls");
		

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(sch);

		session.save(st);
		session.save(st1);

		tx.commit();
		factory.close();

	}
}
