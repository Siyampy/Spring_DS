package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class HelloGame extends ParameterizableViewController  {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//String name=request.getParameter("name");
		
		Map<String, String> m=new HashMap<String, String>();
		m.put("msg", "HEllo......Welcome to the game show   :) ");
		
		//Here the success age names we can be pass dynamically thorugh the xml files.
		ModelAndView mv= new ModelAndView(getViewName(),m);
		
		
		
		return mv;
	
	}

}
