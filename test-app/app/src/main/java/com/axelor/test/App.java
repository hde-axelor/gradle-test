/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.axelor.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
  
    public static void main(String[] args) {
    
      Configuration cfg = new Configuration();
      
      cfg.configure();
      
      SessionFactory factory = cfg.buildSessionFactory();
      
      System.out.println(factory);
      
      
      //student
      
      Student stu = new Student();
      stu.setId(28);
      stu.setName("Harshit");
      stu.setCity("Banglore");
    
    System.out.println(stu);
    
    
    }
}
