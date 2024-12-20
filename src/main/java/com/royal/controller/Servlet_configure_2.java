package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet_configure_2 extends HttpServlet
{
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			
			ServletConfig config = getServletConfig();
			
			PrintWriter out = response.getWriter() ;
			
			response.setContentType("text/html");
			
			out.print("<b>"+config.getServletName()+" :</b><br>");
			
			Enumeration<String> ParamNames = config.getInitParameterNames();
			
			while(ParamNames.hasMoreElements())
			{
				String ParamName = ParamNames.nextElement();
				
				String ParamValue = config.getInitParameter(ParamName);
				
				out.print("<b>"+ParamName+" :- </b>"+ParamValue+"</br>");		
				
			}
			
					
		}
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			doGet(request, response);
		}
}
