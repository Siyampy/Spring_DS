package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
public class Sample extends MultiActionController
{
public ModelAndView empsave(HttpServletRequest request, HttpServletResponse response) throws Exception 
{
	ModelAndView mv= new ModelAndView("save");
	return mv;
}
public ModelAndView empupdate(HttpServletRequest request, HttpServletResponse response) throws Exception 
{	
	ModelAndView mv= new ModelAndView("update");
	return mv;
}
}
