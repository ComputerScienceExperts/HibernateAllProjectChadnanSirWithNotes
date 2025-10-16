package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Student s1 = new Student(1, "chandan", "chandan@gmail.com", 4000);
		Student s2 = new Student(2, "kundan", "kundan@gmail.com", 5000);
		Student s3 = new Student(3, "kiran", "kiran@gmail.com", 6000);
		Student s4 = new Student(4, "shiv", "shiv@gmail.com", 44000);
		Student s5 = new Student(5, "sushila", "sushila@gmail.com", 5000);
		Student s6 = new Student(6, "kamasher", "kamasher@gmail.com", 6000);
		Student s7 = new Student(7, "abc", "abc@gmail.com", 8000);
		Student s8 = new Student(8, "aaa", "aaa@gmail.com", 43000);
		Student s9 = new Student(9, "vvvv", "vvvv@gmail.com", 45000);
		Student s10 = new Student(10, "erte", "chandan@gmail.com", 40020);
		Student s11 = new Student(11, "ddd", "chandan@gmail.com", 40400);
		Student s12 = new Student(12, "ccc", "chandan@gmail.com", 40040);
		Student s13 = new Student(13, "rfrf", "chandan@gmail.com", 44000);
		Student s14 = new Student(14, "frfr", "chandan@gmail.com", 40300);

		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);
		session.save(s6);
		session.save(s7);
		session.save(s8);
		session.save(s9);
		session.save(s10);
		session.save(s11);
		session.save(s12);
		session.save(s13);
		session.save(s14);

		session.flush();
		session.beginTransaction().commit();
		sf.close();
	}
}
