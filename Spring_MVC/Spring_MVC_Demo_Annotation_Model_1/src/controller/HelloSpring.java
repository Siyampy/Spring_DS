package controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Form;

@Controller
public class HelloSpring  
{
	@RequestMapping(method = RequestMethod.GET,value = "/hellospring.ds" )
public String hellospring(Model mv)
{
	mv.addAttribute("msg", "Hello WElcome to the Hello Spring Root page");
	return "output";
}

}

@Controller
class HaiSpring
{
	@GetMapping(path = "/haispring.ds")
	public String haispring(Model mv)
	{
		mv.addAttribute("msg", "Hello WElcome to the Hai Spring Root page");
		return "output";
	}
	@PostMapping(path = "/haispring.ds")
	public String haispringpost(@ModelAttribute(value="employee")Form f,ModelMap mv)
	{		
		mv.addAttribute("msg", "Hello WElcome to the Hai Spring Post handler page");
		mv.addAttribute("name",f.getName() );
		return "output";
	}

}
