package com.simplilearn.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
	
	public static void main(String[] args) {
		
		
		StandardServiceRegistry registry=  new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		
		Metadata metadata=  new MetadataSources(registry).getMetadataBuilder().build();
		
		//connection pool
		SessionFactory factory= metadata.getSessionFactoryBuilder().build();
		//let's take  database connection to  do transaction
		
		//prepare one database in mysql with name Student before  executing below command
		
		 
		
		//let's take  database connection to do transection
				//prepare one databse in mysql with name  Student_hibernate before execution of below command
				
				Session session= factory.openSession();
				
				Student s1=new Student("Pragnesh", "pragnesh@gmail.com", "Pg54321");
				session.save(s1);
				
				Transaction tx= session.beginTransaction();
								
				tx.commit();
				//automatically  prepare  the table and insert the data automatically
				
			
				System.out.println("Data Inserted Succesfully");
	}

}
