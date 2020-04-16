package com.example.construtorInject_02;

public class Salesperson implements Person{
	
	//define a private field for dependency class---FortuneService
	private FortuneService fortuneService;
	
	//define the constructor of that field 
	public Salesperson(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	public String getDetails()
	{
		return "Hi! you need to pay $400. Thanks! VISIT AGAIN.";
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune() ;
	}

}
