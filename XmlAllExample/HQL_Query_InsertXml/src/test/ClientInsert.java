package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.NewStudent;
import beans.OldStudent;

public class ClientInsert {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		OldStudent newStudent1 = new OldStudent(111, "chandan", "royc@gmail.com", "jaipur");
		OldStudent newStudent2 = new OldStudent(222, "Kundan", "Kundan@gmail.com", "jaipur");
		OldStudent newStudent3 = new OldStudent(333, "kiran", "kiran@gmail.com", "jaipur");
		
		session.save(newStudent1);
		session.save(newStudent2);
		session.save(newStudent3);
		
		transaction.commit();
		sf.close();
		
		System.out.println("insert Record Success");
	}
}
