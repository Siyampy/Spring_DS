package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class HelloSpring extends ParameterizableViewController {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
String name=request.getParameter("name");
		
		Map<String, String> m=new HashMap<String, String>();
		m.put("msg", "HEllo......"+name);
		ModelAndView mv= new ModelAndView(getViewName(),m);
		
		return mv;
	}

}
