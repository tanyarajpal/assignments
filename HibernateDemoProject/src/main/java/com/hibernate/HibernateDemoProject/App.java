//package com.hibernate.HinernateDemoProject;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//        //sessionfactory
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory factory = cfg.buildSessionFactory();
//        Student st = new Student();
//        st.setId(101);
//        st.setName("Tanya");
//        st.setCity("Ranchi");
//        System.out.println(st);
//        
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//        session.save(st);
//        
//        
//        tx.commit();
//        session.close();
//        System.out.println("Creation done");
//        
//        
//        
//        
//    }
//}

package com.hibernate.HibernateDemoProject;
//import java.lang.module.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        
        Student st = new Student();
        st.setId(101);
        st.setName("Tanya");
        st.setCity("Ranchi");
        System.out.println(st);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        tx.commit();
        session.close();
        System.out.println("Creation done");
        
        
    }
}
