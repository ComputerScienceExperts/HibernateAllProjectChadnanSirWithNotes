package com.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class ClientSave {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student student = new Student(101, "Chadnan", "royc6549@gmail.com");
		session.save(student);
		transaction.commit();
		sf.close();
		System.out.println("Insert Record Success");
		
	}

}
