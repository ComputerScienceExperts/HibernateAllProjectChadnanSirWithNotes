package com.test;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class ClientDelete {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		String str = "delete from Student s where s.id=101";
		Query query=	session.createQuery(str);
		int i =	query.executeUpdate();
		System.out.println("Delete Id = "+i);
		transaction.commit();
		sf.close();
		System.out.println("Delete Record Success");
		
	}

}
