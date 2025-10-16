package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client2 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session1 = sf.openSession();
		Session session2 = sf.openSession();

		Student student1 = (Student) session1.get(Student.class, 1);
		System.out.println(student1.getName());
		System.out.println(student1.getEmail());
		
		Student student2 = (Student) session1.get(Student.class, 1);
		System.out.println(student2.getName());
		System.out.println(student2.getEmail());
	}
}
