package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class Client_Agarate {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		String hql = "select avg(salary) from Employee";
		Query q = session.createQuery(hql);
		double avg = (Double) q.uniqueResult();
		System.out.println("Salary " + avg);
		sf.close();
		System.out.println("Insert record Success");

	}
}
