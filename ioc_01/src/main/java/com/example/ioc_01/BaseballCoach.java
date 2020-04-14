package com.example.ioc_01;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout()
	{
		return("RUN FOR 30 MIN ON BASEBALL GROUND");
	}
}
