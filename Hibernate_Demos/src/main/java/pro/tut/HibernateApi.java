package pro.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateApi {
public static void main(String[] args) {
	
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	Accounts a=new Accounts("Mr.Ketagale","Kolhapur",12345);
	Accounts a1=new Accounts("Mr.Vyavahare","Washim",96321);
	Accounts a2=new Accounts("Mr.Pisal","Hingoli",78942);
	Accounts a3=new Accounts("Mr.jadhav","Latur",32497);
	
	
	
	session.save(a);
	session.save(a1);
	session.save(a2);
	session.save(a3);
	tx.commit();
	factory.close();
	
	System.out.println("ended");
	
}
}
