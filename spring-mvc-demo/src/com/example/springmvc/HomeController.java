package com.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//STEP 1
@Controller
public class HomeController {

	//step 3
@RequestMapping("/")
//STEP 2
	public String showPage()
	{//step 4
		return "main-menu";
		
	}
}
