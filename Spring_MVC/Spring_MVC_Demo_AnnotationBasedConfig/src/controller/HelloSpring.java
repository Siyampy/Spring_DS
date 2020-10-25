package controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloSpring {

	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//String name=request.getParameter("name");
//		
//		Map<String, String> m=new HashMap<String, String>();
//		m.put("msg", "HEllo......"+name);
//		ModelAndView mv= new ModelAndView("output",m);
//		
//		return mv;
//	}
	
	@RequestMapping(method =RequestMethod.GET)
	public String greetHello(ModelMap model)
	{
		model.addAttribute("msg", "Hello World Again, from Spring 5 MVC");
		return "output";
	}
	
	@RequestMapping(value="/hello.ds",method =RequestMethod.GET)
	public String greetHelloSpring(ModelMap model)
	{
		model.addAttribute("msg", "Hello Spring Again, from Spring 5 MVC");
		return "output";
	}

}
