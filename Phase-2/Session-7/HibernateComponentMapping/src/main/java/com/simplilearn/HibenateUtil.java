package com.simplilearn;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibenateUtil {
	
	private static SessionFactory sessionFactory;
	static {
		
		try {
			
			StandardServiceRegistry registry= new StandardServiceRegistryBuilder().
					configure("hibernate.cfg.xml").build();
			 Metadata metadata= new MetadataSources(registry).getMetadataBuilder()
					 .build();
			 sessionFactory= metadata.getSessionFactoryBuilder().build();
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	

}