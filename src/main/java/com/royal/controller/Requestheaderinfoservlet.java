package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Requestheaderinfoservlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter print = response.getWriter(); 
		Enumeration<String> headernames = request.getHeaderNames();
		
		while(headernames.hasMoreElements())
		{
			String headername = headernames.nextElement();
			String headervalue = request.getHeader(headername);
			
			print.println("<b>"+headername+"</b>" + " -- "+ headervalue +"<br>");
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request,response);
	}
}
