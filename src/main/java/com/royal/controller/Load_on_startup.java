package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Load_on_startup extends HttpServlet
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
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		// 1 time called  when start and restart
		System.out.println("Life_cycle_servlet :: init(ServletConfig config) " +this);
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//everytime when user called
		System.out.println("Life_cycle_servlet :: service(HttpServletRequest request, HttpServletResponse response) :: service  " + this);
	}
	@Override
	public void destroy()
	{
		//called when servlet stop
		System.out.println("Life_cycle_servlet :: destroy() "+this);
	}
}
