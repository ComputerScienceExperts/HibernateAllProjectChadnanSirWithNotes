package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.beans.Student;

public class GetTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resource/mysql.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Object o =session.get(Student.class, 112);
		Student s=  (Student)o;
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		System.out.println(s.getSemail());
		System.out.println(s.getSfee());
		
		session.close();
		sf.close();
		
		

	}

}
