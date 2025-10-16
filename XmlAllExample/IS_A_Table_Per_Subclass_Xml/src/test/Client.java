package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Admin;
import beans.Employee;
import beans.HEmployee;
import beans.SEmployee;

public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		// Employee e = new Employee(111, "Chandan", "royc6549@gmail.com", 30000);

		HEmployee he = new HEmployee(222, "Kundan", "kundan@gmail.com", 4000, 12);
		SEmployee se = new SEmployee(333, "kiran", "kiran@gmail.com", 5000, "Hibernate");
		Admin a = new Admin(111, "Chandan", "Chandan@gmail.com", 3000, "jaipur");

		session.save(he);
		session.save(se);
		session.save(a);

		t.commit();
		sf.close();
		System.out.println("Record Insert success");

	}

}
