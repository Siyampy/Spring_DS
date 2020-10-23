package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HEelloAnnotatedController {

	@RequestMapping(value="/",method = RequestMethod.GET)
	@ResponseBody
	ModelAndView getIdByValue()
	{
		Map<String, String> m=new HashMap<String, String>();
	m.put("msg", "Hello");
		return new ModelAndView("output",m);
	}

}
