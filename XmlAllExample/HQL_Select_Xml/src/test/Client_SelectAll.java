package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class Client_SelectAll {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		String hql = "from Employee";
		Query q =	session.createQuery(hql);
		List<Employee> list = q.list();
		for(Employee emp: list) {
			System.out.println("======================================");
			System.out.println("Id "+emp.getId());
			System.out.println("Name "+emp.getName());
			System.out.println("Email "+emp.getEmail());
			System.out.println("Salary "+emp.getSalary());
		}
		
		sf.close();
		System.out.println("Select record Success");

	}
}
