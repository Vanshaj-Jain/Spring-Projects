package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//This is controller class

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is home URL");
		return "index";
	}

}
