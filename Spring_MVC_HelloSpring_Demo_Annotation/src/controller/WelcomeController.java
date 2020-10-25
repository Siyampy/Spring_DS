package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController 
{
 
	@GetMapping("/Spring_MVC_HelloSpring_Demo_Annotation/hello")
	public String welcome()
	{
		return "String";
	}

}
