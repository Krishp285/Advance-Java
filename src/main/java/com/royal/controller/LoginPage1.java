package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginPage1 extends HttpServlet 
{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter print = response.getWriter();
		
		
		String firstname = request.getParameter("firstname");
		String middlename = request.getParameter("middlename");
		String lastname = request.getParameter("lastname");
		String birthdate = request.getParameter("birthdate");
		String gender1 = request.getParameter("gender1");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String postalcode = request.getParameter("postalcode");
		String email = request.getParameter("email");
		String mobilenumber = request.getParameter("mobilenumber");
		String course = request.getParameter("course");
		String additionalcomment = request.getParameter("additionalcomment");
		
		
		print.print("firstname :-"+firstname+"<br>");
		print.print("middlename :-"+middlename+"<br>");
		print.print("lastname :-"+lastname+"<br>");
		print.print("birthdate :-"+birthdate+"<br>");
		print.print("gender1 :-"+gender1+"<br>");
		print.print("address :-"+address+"<br>");
		print.print("city :-"+city+"<br>");
		print.print("state :-"+state+"<br>");
		print.print("postalcode :-"+postalcode+"<br>");
    	print.print("email :-"+email+"<br>");
		print.print("mobilenumber :-"+mobilenumber+"<br>");
		print.print("course :-"+course+"<br>");
		print.println("additionalcomment:-"+additionalcomment);
	}
}
