package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet_context_1 extends HttpServlet
{
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			
			ServletContext context = request.getServletContext();
			
			String UrlName = context.getInitParameter("URLNAME");
			String DriverClass = context.getInitParameter("DRIVERCLASS");
			String UserName = context.getInitParameter("USERNAME");
			String Password = context.getInitParameter("PASSWORD");
			
			PrintWriter out = response.getWriter() ;
			
			response.setContentType("text/html");
			
			
			out.print("<b> servlet-context-1 :</b><br>");
			
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
