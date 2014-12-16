package com.ekiras.domain;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String args[]){
	
		System.out.println("Hello World");
		
		//creating session factory object and load configurations from hibernate.cfg.xml
	    @SuppressWarnings("deprecation")
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    session.beginTransaction();  
	    Hotel h1 = new Hotel();
	    h1.setId(1L);
	    h1.setName("Hotel Taj");
	    
	    session.save(h1);
	    session.getTransaction().commit();
	    session.close();
	    
		
		
		
	}
	
}
