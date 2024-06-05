package app.bike;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Bike b1 = new Bike(1,"Apache",70000);
    	//Bike b2 = new Bike(2,"Hero",90000);

    	Configuration cf=new Configuration().configure();
    	SessionFactory sf=cf.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	//s.save(b1);
    	//s.save(b2);
    	Bike b3=s.get(Bike.class, 1);
    	//Bike b4=s.get(Bike.class, 2);

    	System.out.println(b3);
    	//System.out.println(b4);
       //s.delete(b3); it will delete the object
    	tx.commit();
    }
}
