package com.hiberApp3.CRUD.Operation.hiber;

import java.util.*;
import com.hiberApp3.CRUD.Operation.hiber.Laptop;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
   	 Configuration cfg= new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session sess = factory.openSession();
        Transaction tx =  sess.beginTransaction();
        
        
     
        Laptop l = sess.get(Laptop.class, 3);
        /*****************************************/
        //Update . --> l.setL_name("Muddebihal:");
       // one row deleted i.e one object deleted ** sess.delete(l);
        System.out.println(l);
   
        
        
        
        
        
        
        
        
//        Laptop l1 = sess.get(Laptop.class, 2);
//        System.out.println(l1);
//        List<Laptop> list = new ArrayList<Laptop>();
//        @SuppressWarnings("rawtypes")
//		Query query = sess.createQuery("from laptop");
//        list = query.list();
       // List<Laptop> listOfLaptops=sess.createQuery("from Laptop").getResultList();
        //sess.update(Laptop);
//        for(Laptop o : listOfLaptops) {
//        	System.out.println(o);
//        }
        //System.out.println(list);
        
        tx.commit();

	}

}
