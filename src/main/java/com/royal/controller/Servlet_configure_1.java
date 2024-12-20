package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet_configure_1 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		ServletConfig config = getServletConfig();
		
		String UrlName = config.getInitParameter("URLNAME");
		String DriverClass = config.getInitParameter("DRIVERCLASS");
		String UserName = config.getInitParameter("USERNAME");
		String Password = config.getInitParameter("PASSWORD");
		
		PrintWriter out = response.getWriter() ;
		
		response.setContentType("text/html");
		
		
		out.print("<b>"+config.getServletName()+" :</b><br>");
		
		out.print("<b>UrlName :- </b>"+UrlName+"</br>");
		out.print("<b>DriverClass :- </b>"+DriverClass+"</br>");
		out.print("<b>UserName :- </b>"+UserName+"</br>");
		out.print("<b>Password :- </b>"+Password+"</br>");
		
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
