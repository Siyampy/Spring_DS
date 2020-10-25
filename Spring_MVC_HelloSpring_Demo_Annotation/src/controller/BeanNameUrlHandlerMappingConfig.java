package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;

@Configuration
public class BeanNameUrlHandlerMappingConfig {	
//	ModelAndView getIdByValue()
//	{
//		Map<String, String> m=new HashMap<String, String>();
//	m.put("msg", "Hello");
//		return new ModelAndView("output",m);
//	}
 
	@Bean
	BeanNameUrlHandlerMapping beanNameUrlHandlerMapping()
	{
		return new BeanNameUrlHandlerMapping();
	}
	@Bean("/hello")
	public WelcomeController welcome()
	{
		return new WelcomeController();
	}
}
