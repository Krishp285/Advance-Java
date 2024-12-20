package com.royal.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
	//1) make credentials
	
	public static final String URLNAME = "jdbc:mysql://localhost:3306/collegemanagement";
	public static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";

	
	//2) create getconnection method
	
	public static Connection getconnection()
	{
		Connection conn = null;
		
		try 
		{
			//3) load driver class
			Class.forName(DRIVERCLASS);
			
			//4) pass credentials into drivermanger's getconnection method
			conn =  DriverManager.getConnection(URLNAME,USERNAME,PASSWORD);
		
			//5) validate database connection object
			
			if(conn!=null)
			{
				System.out.println("DB connected : "+ conn);
			}
			else
			{
				System.out.println("DB connected : "+ conn);
			}
		} catch (Exception e)
		{

			e.printStackTrace();
		}
		return conn;
	
	}
	public static void main(String[] args) 
	{
		Connection conn = DBConnection.getconnection();
		System.out.println("In connection"+conn);
	}
}
