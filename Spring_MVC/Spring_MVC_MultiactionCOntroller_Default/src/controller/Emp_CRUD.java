package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class Emp_CRUD  extends MultiActionController
{
	 static String url = "jdbc:mysql://localhost:3306/college?useSSL=false";
	 static  String user = "root";
	 static String password = "Dh@nu5h!&&&";
 
public ModelAndView empsave(HttpServletRequest request, HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String address=request.getParameter("address");
	Connection con=DriverManager.getConnection(url, user, password);
	ResultSet rs=con.createStatement().executeQuery("select max(id) from emp ");
	int maxid=0;
if(rs.next())
{
	maxid=rs.getInt(1);
	maxid++;	
}

PreparedStatement ps= con.prepareStatement("insert into emp values(?,?,?)");
ps.setInt(1, maxid);
ps.setString(2, name);
ps.setString(3,email);
ps.setString(4, address);
	int i=ps.executeUpdate();
	con.close();
	ModelAndView mv=null;
	if(i==1)
		mv= new ModelAndView("success");
	else
		mv=  new ModelAndView("failure");
	
	return mv;
		
	
}

public ModelAndView empupdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String address=request.getParameter("address");
	int id=Integer.parseInt(request.getParameter("id"));
	Connection con=DriverManager.getConnection(url, user, password);
	PreparedStatement ps= con.prepareStatement("update emp set name=?,email=?, address=? where id=?");
	ps.setInt(4, id);
	ps.setString(1, name);
	ps.setString(2,email);
	ps.setString(3, address);
		int i=ps.executeUpdate();
		con.close();
		ModelAndView mv=null;
		if(i==1)
			mv= new ModelAndView("success");
		else
			mv=  new ModelAndView("failure");
		
		return mv;
	
}
}
