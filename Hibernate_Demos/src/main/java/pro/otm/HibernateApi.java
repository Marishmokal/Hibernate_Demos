package pro.otm;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateApi {
public static void main(String[] args) {
	
	
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx =session.beginTransaction();
	Cart cart1=new Cart();
	cart1.setName("sita");
	cart1.setTotal(234);
	
	
	Items item1=new Items("78", 30d, 5, cart1);
	Items item2=new Items("34", 34d, 6, cart1);
	Items item3=new Items("12", 36d, 7, cart1);
	Items item4=new Items("15", 34d, 8, cart1);
	
	Set<Items> set1=new HashSet();
	set1.add(item1);
	set1.add(item2);
	set1.add(item3);
	set1.add(item4);
	
	cart1.setItems(set1);
	
	session.save(cart1);
	session.save(item1);
	session.save(item2);
	session.save(item3);
	session.save(item4);
	
	tx.commit();
	factory.close();
	
	System.out.println("done....!!!");
	
}
}
