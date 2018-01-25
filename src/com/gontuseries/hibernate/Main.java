package com.gontuseries.hibernate;

import org.hibernate.cfg.Configuration;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args)throws Exception {
		Student student1 = new Student();
		student1.setStudent_name("atin");
		Student student2=new Student();
		student2.setStudent_name("mehul");
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();

		session.save(student1);
		session.save(student2);
	   /*student=(Student)session.get(Student.class,1);
        System.out.println("studentname= "+student.getStudent_name());*/
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
	}
}