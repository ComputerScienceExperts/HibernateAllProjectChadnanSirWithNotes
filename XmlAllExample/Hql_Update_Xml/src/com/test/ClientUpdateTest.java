package com.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class ClientUpdateTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		String str = "update Student s set s.name='kiran', s.email='kiran@gmail.com' where s.id=101";
		Query q = session.createQuery(str);
		int i = q.executeUpdate();
		System.out.println(i);
		transaction.commit();
		sf.close();
		System.out.println("Update Record Success");

	}

}
