package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.royal.bean.Student_Bean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Insert_data_in_tableform extends HttpServlet
{
	 ArrayList<Student_Bean> list = new ArrayList<Student_Bean>();
	int rno = 1;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String lastName = request.getParameter("lastName");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String hbValues[] = request.getParameterValues("hobbies");
		String address = request.getParameter("address");
		String state = request.getParameter("state");
				
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ;i < hbValues.length;i++)
		{
			if(i<(hbValues.length-1))
			{
				sb.append(hbValues[i]+" ,");
			}
			else
			{
				sb.append(hbValues[i]+".");
			}
		}
		
		String hobbies = sb.toString();
		
		
	
		Student_Bean sbean = new Student_Bean(rno,firstName,middleName,lastName,dob,gender,hobbies,address,state);
		
		list.add(sbean);
		
		response.setContentType("text/html");
		
		request.setAttribute("ListOfStudent",list);
		
		RequestDispatcher rd = request.getRequestDispatcher("listOfStudent");
		rd.forward(request,response);
		
		
		rno++;
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
