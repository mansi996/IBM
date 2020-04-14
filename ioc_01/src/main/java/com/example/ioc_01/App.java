package com.example.ioc_01;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//to access any other class methods or data we need an object
    	
        //create the object
    	//call the interface name to access the class object
    	Coach theCoach= new RunnerCoach();
    	
    	//get the object
    	System.out.println(theCoach.getDailyWorkout());
    	

    	
    }
}
