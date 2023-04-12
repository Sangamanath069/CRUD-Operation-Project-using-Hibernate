package com.hiberApp3.CRUD.Operation.hiber;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	 Configuration cfg= new Configuration();
         cfg.configure();
         SessionFactory factory = cfg.buildSessionFactory();
         Session sess = factory.openSession();
         
         boolean b = true;
         while(b) {
        Transaction tx =  sess.beginTransaction();
    	System.out.println("Please enter laptop ID");
    	int id = sc.nextInt();
    	sc.nextLine();
    	System.out.println("Please enter laptop Name");
    	String name = sc.nextLine();
    	System.out.println("Please enter laptop price");
    	String l_price = sc.nextLine();
        Laptop l1 = new Laptop(id,name,l_price);
//        Laptop l2 = new Laptop(id,name,brand);
//        Laptop l3 = new Laptop(id,name,brand);
//        Laptop l4 = new Laptop(id,name,brand);
//        Laptop l5 = new Laptop(id,name,brand);
       
        sess.save(l1);
        tx.commit();
        System.out.println("Want to continue to insert a row ??!!");
        System.out.println("If yes please type \"YES\" OR type \"NO\" ");
        String str = sc.nextLine();
        if("yes".equals(str.toLowerCase())) {
        	b=true;
        }else {
        	b = false;
        }
         }
        
    }
}
