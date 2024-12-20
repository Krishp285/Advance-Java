package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Pattern_loop extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		PrintWriter out = response.getWriter();
		
			int no = 5;
			
			
			for(int i = 1;i<=5;i++)
			{
				for(int j = 1 ; j<=i;j++)
				{
				
					out.print("*");
				}
				out.println();
			}
			
		
			
			
			out.println("-------------------");
			
			for(int i = 1;i<=5;i++)
			{
				for(int j = 5 ; j>=i;j--)
				{
				
					out.print("*");
				}
				out.println();
			}
			
		
			
			out.println("-------------------");
			
			for(int i = 1;i<=5;i++)
			{
				for(int k = 5 ; k>=1;k--)
				{
					out.print(" ");
				}
				for(int j = 1 ; j<=i;j++)
				{
				
					out.print(" * ");
				}
				out.println();
			}
			
				
	}
}
