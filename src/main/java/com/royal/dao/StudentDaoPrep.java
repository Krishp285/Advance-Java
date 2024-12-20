package com.royal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.royal.bean.StudentBean;
import com.royal.util.DBConnection;

//inser update delete --> executeupdate()
// select --> get rows --> executeQuery()
public class StudentDaoPrep
{
	public int insertStudent(StudentBean sbean)
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES (?,?,?)";
		int rowsAffected = 0;
		Connection conn = DBConnection.getconnection();
		PreparedStatement pstmt = null;
		
		if(conn!=null)
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
				
				pstmt.setString(1,sbean.getName());
				pstmt.setString(2,sbean.getStd());
				pstmt.setInt(3,sbean.getMarks());
				
				rowsAffected = pstmt.executeUpdate();
			} 
			catch (Exception e) 
			{
			e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StudentDaoPrep ------ insertStudent() DB not connected");
		}
									
		return rowsAffected;

	
	}
	
	public int deleteStudent(StudentBean sbean)
	{
		String deleteQuery = "DELETE FROM student where rno = ? ";
		int rowsAffected = 0;
		Connection conn = DBConnection.getconnection();
		PreparedStatement pstmt = null;
		
		if(conn!=null)
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery);
				
				//pstmt.setString(1,sbean.getName());
				//pstmt.setString(2,sbean.getStd());
				//pstmt.setInt(3,sbean.getMarks());
				
				rowsAffected = pstmt.executeUpdate();
			} 
			catch (Exception e) 
			{
			e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StudentDaoPrep ------ deleteStudent() DB not connected");
		}
									
		return rowsAffected;

	
	}

	public int updateStudent(StudentBean sbean,int rno1)
	{
		String updateQuery = " UPDATE student set name = ? , std = ? , marks = ? where rno = ? ";
		int rowsAffected = 0;
		Connection conn = DBConnection.getconnection();
		PreparedStatement pstmt = null;
		
		if(conn!=null)
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);
				
				pstmt.setString(1,sbean.getName());
				pstmt.setString(2,sbean.getStd());
				pstmt.setInt(3,sbean.getMarks());
				pstmt.setInt(4,rno1);
				
				rowsAffected = pstmt.executeUpdate();
			} 
			catch (Exception e) 
			{
			e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StudentDaoPrep ------ updateStudent() DB not connected");
		}
									
		return rowsAffected;

	
	}
	
	public StudentBean getStudentByRno(int rno1)
	{
		String selectByRno = "SELECT * FROM student where rno = "+rno1;
		Connection conn = DBConnection.getconnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentBean sbean = null;
		
		if(conn != null)
		{
			try 
			{
				pstmt = conn.prepareStatement(selectByRno);
				rs = pstmt.executeQuery(selectByRno);
				
				if(rs.next())
				{
					int rno = rs.getInt(1);
					String name = rs.getString(2);
					String std = rs.getString(3);
					int marks = rs.getInt(4);
					
					sbean = new StudentBean(rno,name,std,marks);
				}
				
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StudentDao :; getAllRecords() -- Db not connected");
		}
		
		return sbean;
	}
	
	
	public static void main(String[] args) 
	{
		//-------------------INSERT ------------------
		
		/*
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc1.nextLine();
		System.out.println("Enter Std : ");
		String std = sc1.nextLine();
		System.out.println("Enter Marks : ");
		int marks = sc1.nextInt();
		
		StudentDao dao11 = new StudentDao();
		
		StudentBean sbean1 = new StudentBean(0, name, std, marks);
		
		int  rowAffected = dao11.insertStudent(sbean1);
		
		if (rowAffected > 0 ) 
		{
			System.out.println("Student record successfully inserted : " + rowAffected); 
		} else 
		{
			System.out.println("Student record not inserted : " + rowAffected); 
		}
		*/
		
		
		//------------------DELETE --------------------
		
		/*
		 
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Rno which you want to delete : ");
		int rno = sc1.nextInt();
		StudentDao dao11 = new StudentDao();
		
		StudentBean sbean1 = new StudentBean();
		
		int  rowAffected = dao11.deleteStudent(rno);
		
		if (rowAffected > 0 ) 
		{
			System.out.println("Student record successfully deleted : " + rowAffected); 
		} else 
		{
			System.out.println("Student record not deleted : " + rowAffected); 
		}
		
		*/
		
		//-------------- UPDATE --------------------
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno which you want to update : ");
		int rno1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		String std = sc.nextLine();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentDao dao11 = new StudentDao();
		
		StudentBean sbean1 = new StudentBean(0, name, std, marks);
		
		int  rowAffected = dao11.updateStudent(sbean1,rno1);
		
		if (rowAffected > 0 ) 
		{
			System.out.println("Student record successfully updated : " + rowAffected); 
		} else 
		{
			System.out.println("Student record not updated : " + rowAffected); 
		}
		
		*/
		//------------------ GET ALL STUDENT --------------------
		
				
				 
		Scanner sc = new Scanner(System.in);
		StudentDao dao = new StudentDao();
		
		System.out.println("Enter rno to search :- ");
		int rno = sc.nextInt();
		
		StudentBean sbean = dao.getStudentByRno(rno);
		
		if(sbean != null)
		{
			System.out.println(sbean.getRno()+" "+sbean.getName()+" "+sbean.getStd()+" "+sbean.getMarks());
		}
		else
		{
			System.out.println("Student record not found ");
		}
		
		
		//----------SELECT Student-------------
		/*
		StudentDao dao1 = new StudentDao();

		ArrayList<StudentBean> list = dao1.getAllStudentsRecords();
		
		System.out.println("list.size() : " + list.size());
		
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		*/		
				
				
		
	}
		
}
