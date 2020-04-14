package com.example.ioc_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class runUsingXml 
{
	public static void main(String[] args)
	{
		//load the configuration file
		ClassPathXmlApplicationContext context=new 
				ClassPathXmlApplicationContext("applicationContext.xml");
				
		
		//retrieve the spring container
		
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		//call the method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}
}