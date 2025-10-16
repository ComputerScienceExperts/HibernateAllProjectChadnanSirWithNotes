package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class Client {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		Employee e1 = new Employee(111, "Chandan", "royc6549@gmail.com", "50000");
		Employee e2 = new Employee(222, "Kundan", "Kundan6549@gmail.com", "30000");
		Employee e3 = new Employee(333, "kiran", "kiran6549@gmail.com", "80000");
		session.save(e1);
		session.save(e2);
		session.save(e3);
		t.commit();
		sf.close();
		System.out.println("Insert record Success");

	}
}
