package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Visitorcount_ipaddress extends HttpServlet 
{
	static int visitorcount = 0;
	@Override
	protected void service(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{
		visitorcount++;
		
		PrintWriter out = response.getWriter();
		
		String ipaddress = request.getRemoteAddr();
		
		System.out.println("Visitorcount_ipaddress :: ipaddress -->"+ipaddress + " visitor count -->"+visitorcount);

		out.println("Visitorcount_ipaddress :: ipaddress -->"+ipaddress + " visitor count -->"+visitorcount);
	}
}
