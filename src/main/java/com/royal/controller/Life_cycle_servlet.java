package com.royal.controller;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// object created only once

public class Life_cycle_servlet extends HttpServlet
{
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
/**/