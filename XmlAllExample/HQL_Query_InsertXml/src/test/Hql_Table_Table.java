package test;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hql_Table_Table {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("resources/mysql.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // HQL: Insert from one entity into another
        String str = "insert into NewStudent(id,name,email,address) "
                   + "select s.id, s.name, s.email, s.address from OldStudent s";
        Query q = session.createQuery(str);
        int count = q.executeUpdate();

        tx.commit();  // Important: commit the transaction

        System.out.println(count + " record(s) dumped from OldStudent to NewStudent.");

        session.close();
        sf.close();
    }
}
