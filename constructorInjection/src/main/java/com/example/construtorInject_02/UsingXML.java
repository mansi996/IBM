package com.example.construtorInject_02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingXML {


	public static void main(String[] args) {
		
		//create a spring container 
		ClassPathXmlApplicationContext context= new
							ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve 
		Person myPerson=context.getBean("myPerson",Person.class);
		
		//call methods
		System.out.println(myPerson.getDetails());
		//call new methods for the dependency that we created 
		System.out.println(myPerson.getFortune());
		
		//close context
		context.close();
		
	

	}

}
