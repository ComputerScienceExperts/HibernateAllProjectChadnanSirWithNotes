package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.Student;

public class MergeTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx= session.beginTransaction();
		
		Student s = new Student();
		s.setSid(112);
		s.setSname("Kundan");
		s.setSemail("royc649@gmail.com");
		s.setSfee(23445);
		session.merge(s);
			tx.commit();
		session.close();
		sf.close();
		

	}

}
