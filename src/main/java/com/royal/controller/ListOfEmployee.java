package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.royal.bean.EmployeeBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListOfEmployee extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("ListOfEmployee :: doget()");
		
		Object obj = request.getAttribute("listemployees");
		
		ArrayList<EmployeeBean> list = (ArrayList<EmployeeBean>)obj ;
		
		PrintWriter out = response.getWriter();
		
		out.print("<table border = 1>");
		out.print("<tr>");
		out.print("<th>Eid</th>");
		out.print("<th>FullName</th>");
		out.print("<th>Birth Date</th>");
		out.print("<th>Gender</th>");
		out.print("<th>Languages</th>");
		out.print("<th>Email</th>");
		out.print("<th>Mobile</th>");
		out.print("<th>state</th>");
		out.print("<th>department</th>");
		out.print("<th>designation</th>");
		out.print("<th>employment</th>");
		out.print("</tr>");
		
		
		for(int i=0;i<list.size();i++)
		{
			EmployeeBean e = list.get(i);
			out.print("<tr>");
			out.print("<td>"+e.getEid()+"</td>");
			out.print("<td>"+e.getFullname()+"</td>");
			out.print("<td>"+e.getBirthdate()+"</td>");
			out.print("<td>"+e.getGender()+"</td>");
			out.print("<td>"+e.getLanguage()+"</td>");
			out.print("<td>"+e.getEmail()+"</td>");
			out.print("<td>"+e.getMobile()+"</td>");
			out.print("<td>"+e.getState()+"</td>");
			out.print("<td>"+e.getDepartment()+"</td>");
			out.print("<td>"+e.getDesignation()+"</td>");
			out.print("<td>"+e.getEmployment()+"</td>");
			out.print("</tr>");
			
		}
		
		out.print("</table>");
		
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
