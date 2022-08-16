package com.simplilearn.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.custom.CustomEventPublisher;

public class App 
{
    public static void main( String[] args )
    {
         //BeanFactory factory= new XmlBeanFactory(resources);
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	
    	HelloWorld h= (HelloWorld)context.getBean("obj");
    	h.print();
    	
    	
    	Student s=(Student) context.getBean("s1");
    	
    	System.out.println("Id: "+s.getId());
    	System.out.println("Name: "+s.getName());
    	
    	
    	
    	Marks m=s.getMarks();
    	
    	System.out.println("Physics: "+m.getPhy());
    	System.out.println("Chemistry: "+m.getChem());
    	System.out.println("Mathematics: "+m.getMaths());
    	
    	//default event handling

    	ConfigurableApplicationContext context1= new ClassPathXmlApplicationContext("main-servlet.xml");
    	context1.start();
    	context1.stop();
    	
    	
    	//custom event handling
    	
    	CustomEventPublisher cep=(CustomEventPublisher)context1.getBean("cep");
    	cep.publish();
    	
    	
    	
    }
}
