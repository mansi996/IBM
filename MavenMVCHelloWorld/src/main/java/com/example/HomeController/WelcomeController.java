package com.example.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
//step1 - add controller annotation to the controller class
public class WelcomeController {

	//step 3 
@RequestMapping("/")
	//step 2- make a controller method
	public String showPage()
	{
		return "main-menu"; //where main-menu is the name of jsp file under the view folder
	}
	

}
