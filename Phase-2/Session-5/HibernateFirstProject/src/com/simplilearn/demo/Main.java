package com.simplilearn.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class Main {
	
	public static void main(String[] args) {
		
		StandardServiceRegistry registry=  new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		
		Metadata metadata=  new MetadataSources(registry).getMetadataBuilder().build();
		
		//connection pool
		SessionFactory factory= metadata.getSessionFactoryBuilder().build();
		//let's take  database connection to  do transaction
		
		//prepare one database in mysql with name Student before  executing below command
		
		Session  session= factory.openSession();
		
		Student s1= new Student();
		s1.setName("Baljeet");
		s1.setEmail("baljeet@gamil.com");
		s1.setPassword("bljt@123");
		
		Transaction tx=session.beginTransaction();
		session.save(s1);
		
		tx.commit();
		//automatically table created in db and data inserted in the same
		
		session.close();
		factory.close();
		
		System.out.println("Data Inserted Successfully");
		
			
			 
		 
		
	}

}
