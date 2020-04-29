package com.example.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	@RequestMapping("/showForm")
	//for creating a form
	public String createForm()
	{
		return "showForm";
	}
	
	//for submit and process a form
	
	@RequestMapping("/processForm")
	//for getting the details after entering into the form
	public String processForm()
	{
		return "processForm";
	}
	
	
	
}
