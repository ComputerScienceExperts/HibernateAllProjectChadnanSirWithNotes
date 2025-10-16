package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class Client_Row1_Select {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		String hql = "from Employee where id=111";
		
		Query q =	session.createQuery(hql);
		Employee e = (Employee) q.uniqueResult();
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getEmail());
		System.out.println(e.getSalary());
		
		sf.close();
		System.out.println("Select record Success");

	}
}
