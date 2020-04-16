package com.example.construtorInject_02;

public class Customer implements Person {

	//define a private field for dependency class---FortuneService
	private FortuneService fortuneService;
	
	//define the constructor of that field 
	public Customer(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	
	public String getDetails()
	{
		return "GIVE ME MY BILL WITH DETAILS";
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}
	
}
