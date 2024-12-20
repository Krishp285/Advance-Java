package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Prime_number extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int count = 0;
		PrintWriter print = response.getWriter();
		
		for(int i =1 ; i<=1000 ;i++)
		{
			int prime = 0;
			for(int j = 2 ; j<i ; j++)
			{
				if(i%j == 0)
				{
					prime = 1;
					break;
				}		
			}
				
				if(prime == 0 && i>1)
				{
					print.print(" "+i+" ");
					count++;
				}
			
		}
		
		print.println("count :->"+count);
	}
}
