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
// The same name of the url mapping is to be given as the handler function when using the MultiAction controller.
//To customize the usage of the methods then we neeed the MethodResolver.
public ModelAndView empadd(HttpServletRequest request, HttpServletResponse response) throws Exception 
{	
	ModelAndView mv= new ModelAndView("add");
	return mv;
}
}
