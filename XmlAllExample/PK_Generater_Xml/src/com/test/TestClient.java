package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.Movie;

public class TestClient {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("resources/movie.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session= sf.openSession();
		Transaction tx= session.beginTransaction();
		
		Movie movie = new Movie();
		movie.setMid(1);
		movie.setMname("PK");
		movie.setMseatno(23);
		movie.setMtime("2pm");
		int pk = (Integer)session.save(movie);
		System.out.println(pk);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("Insert record Success");
	}
}
