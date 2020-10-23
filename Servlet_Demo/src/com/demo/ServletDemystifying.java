package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDemystifying")
//@WebServlet(
//		description = "ServletDemystifying Servlet", 
//		urlPatterns = { "/ServletDemystifying" }, 
//		initParams = { 
//				@WebInitParam(name = "user", value = "Pankaj"), 
//				@WebInitParam(name = "password", value = "journaldev")
//		})
public class ServletDemystifying extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config)throws ServletException
	{
		System.out.println("Im initiated");
	}
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
            {
//		PrintWriter out=res.getWriter(); 
		System.out.println("Im starting my service ");
		System.out.println(req.getHttpServletMapping());
		System.out.println(req.getMethod());
//		out.println();
		doPost(req,res);
		
			
            }
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPut(req, resp);
		System.out.println(req.getContextPath());
		System.out.println(req.getParameter("user"));
//		if(dispatch)
//		{
//			RequestDispatcher req =req.getRequestDispatcher("/ServletDemo");		
//		}
//		else
//		{
//			resp.sendRedirect(req.getContextPath() + "/welcome.jsp");
//			
//		}
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
//		out.print("<b>"+req.isSecure()+"</b>");  
		out.print("<b>"+req.getParameter("user")+"</b>"); 
		out.print("</body></html>");  
		  
	}
	public void destroy()
	{
		System.out.println("Im destroyed");
		
	}
	

}
