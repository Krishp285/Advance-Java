package com.royal.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.royal.bean.EmployeeBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Insert_employeedata_in_tableform extends HttpServlet
{
	
	ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
	int eid =1;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String fullname = request.getParameter("fullname");
		String birthdate = request.getParameter("birthdate");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String state = request.getParameter("state");
		String lValues[] = request.getParameterValues("languages");
		String department = request.getParameter("department");
		String designation = request.getParameter("designation");		
		String employment = request.getParameter("employment");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i < lValues.length ; i++)
		{
			if(i<(lValues.length-1))
			{
				sb.append(lValues[i]+" ,");
			}
			else
			{
				sb.append(lValues[i]+".");
			}
		}
		
		String language = sb.toString();
		
		EmployeeBean ebean = new EmployeeBean(eid,fullname,birthdate,gender,language,email,mobile,state,department,designation,employment);
			
		list.add(ebean);
		
		response.setContentType("text/html");
		
		System.out.println("list of size : " + list.size());
		
		request.setAttribute("listemployees",list);
		
		RequestDispatcher rd = request.getRequestDispatcher("listOfEmployee");
		rd.forward(request,response);
		
		
		eid++;
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
