package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.royal.bean.Student_Bean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListOfStudent extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("ListOfStudent :: doget()");
		
		Object obj = request.getAttribute("ListOfStudent");
		
		ArrayList<Student_Bean> list = (ArrayList<Student_Bean>)obj;
		
	PrintWriter out = response.getWriter();
		
		out.print("<table border = 1>");
		out.print("<tr>");
		out.print("<th>Rno</th>");
		out.print("<th>FirstName</th>");
		out.print("<th>MiddleName</th>");
		out.print("<th>LastName</th>");
		out.print("<th>DOB</th>");
		out.print("<th>Gender</th>");
		out.print("<th>Hobbies</th>");
		out.print("<th>Address</th>");
		out.print("<th>State</th>");
		out.print("</tr>");
		
		
		
		for(int i=0;i<list.size();i++)
		{
			Student_Bean s = list.get(i);
			out.print("<tr>");
			out.print("<td>"+s.getRno()+"</td>");
			out.print("<td>"+s.getFirstName()+"</td>");
			out.print("<td>"+s.getMiddleName()+"</td>");
			out.print("<td>"+s.getLastName()+"</td>");
			out.print("<td>"+s.getDob()+"</td>");
			out.print("<td>"+s.getGender()+"</td>");
			out.print("<td>"+s.getHobbies()+"</td>");
			out.print("<td>"+s.getAddress()+"</td>");
			out.print("<td>"+s.getState()+"</td>");
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
