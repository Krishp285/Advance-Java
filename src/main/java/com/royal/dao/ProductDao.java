package com.royal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.royal.bean.ProductBean;

import com.royal.util.DBConnection;

public class ProductDao 
{

	public  int insertProduct(ProductBean pbean) 
	{
		int  rowAffected = 0 ;
		String insertQuery = "INSERT INTO product(name,category,brand,price,quantity_in_stock,description) VALUES ('"+ pbean.getName() +"','"+ pbean.getCategory() +"',' "+ pbean.getBrand() +"','"+ pbean.getPrice() +"','"+ pbean.getQuantity_in_stock() +"','"+ pbean.getDescription() +"')";

		System.out.println("insertQuery : " + insertQuery);
		
		Connection conn = DBConnection.getconnection();
		
		if (conn != null) 
		{
			try 
			{
				Statement stmt = conn.createStatement();
				
				rowAffected = stmt.executeUpdate(insertQuery);
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("ProductDao---insertProduct() ---Database not connected");
		}
		return rowAffected;
	}
	public  int updattProduct(ProductBean pbean,int id) 
	{
		String updateQuery = "UPDATE product SET name='"+ pbean.getName() +"','"+ pbean.getCategory() +"',' "+ pbean.getBrand() +"','"+ pbean.getPrice() +"','"+ pbean.getQuantity_in_stock() +"','"+ pbean.getDescription() +" WHERE id="+id;

		System.out.println("updateQuery : " + updateQuery);
		
		Connection conn = DBConnection.getconnection();
		
		int rowsAffected = 0 ;

		if (conn!=null) 
		{
			try 
			{
				Statement stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(updateQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("ProductDao---updateProduct() Db not connecteed : " + conn);
		}
		
		return rowsAffected;		
	}
	public int deleteProduct(int id) 
	{
		int rowAffected = 0 ;
		String deleteQuery = "DELETE FROM product WHERE rno = "+id;
		
		Connection conn = DBConnection.getconnection();
		
		if (conn!=null) 
		{
			try 
			{
				Statement stmt = conn.createStatement();
			
				rowAffected = stmt.executeUpdate(deleteQuery); 
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("ProductDao---Db not connected : " + conn);
		}
		return rowAffected;
	}
	public ArrayList<ProductBean> getAllProductsRecords() 
	{
		ArrayList<ProductBean> list = new ArrayList<ProductBean>();
		String selectQuery = "SELECT  id,name,category,brand,price,quantity_in_stock,description FROM product";
		Connection conn = DBConnection.getconnection();
		Statement stmt = null;
		ResultSet rs = null;
		ProductBean pbean = null;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next()) 
				{
					int id  	= rs.getInt(1);	
					String name	= rs.getString(2);	
					String category	= rs.getString(3);	
					String brand	= rs.getString(4);	
					int price	= rs.getInt(5);	
					int quantity_in_stock	= rs.getInt(6);	
					String description = rs.getString(7);
					
					pbean = new ProductBean(id,name,category,brand,price,quantity_in_stock,description);
					
					list.add(pbean);

				}
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("ProductDao :: getAllRecords()---Db not connected");
		}
		return list;
	}
	public static void main(String[] args) 
	{
		
		//----------SELECT Student-------------
		
		ProductDao dao = new ProductDao();

		ArrayList<ProductBean> list = dao.getAllProductsRecords();
		
		System.out.println("list.size() : " + list.size());
		
		
		for (int i = 0; i < list.size(); i++) 
		{
			ProductBean p = list.get(i);
			
			System.out.println(p.getId()+" " + p.getName()+" " + p.getCategory()+" " + p.getBrand() + " " +  p.getPrice() +" " + p.getQuantity_in_stock()+" " + p.getDescription());
		}
		//----------UPDATE Student-------------
/*		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id which you want to Update : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Category : ");
		String category = sc.nextLine();
		System.out.println("Enter brand : ");
		String brand = sc.nextLine();
		System.out.println("Enter price : ");
		int price = sc.nextInt();
		System.out.println("Enter quantity_in_stock : ");
		int quantity_in_stock = sc.nextInt();
		System.out.println("Enter description : ");
		String description = sc.nextLine();
		sc.nextLine(); 
		
		ProductDao dao = new ProductDao();
		
		ProductBean pbean = new ProductBean(0,name,category,brand,price,quantity_in_stock,description);
		
		int  rowAffected = dao.updateProduct(pbean,id);
		
		if (rowAffected > 0 ) 
		{
			System.out.println("Product record successfully Updated : " + rowAffected); 
		} else 
		{
			System.out.println("Product record not Updated : " + rowAffected); 
		}
		
		//----------DELETE Student-------------
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id which you want to Delete Product record : ");
		int rno = sc.nextInt();
		
		ProductDao dao = new ProductDao();
		
		int rowAffected = dao.deleteProduct(id);
		
		if (rowAffected > 0 ) 
		{
			System.out.println("Product record successfully Deleted : " + rowAffected); 
		} else 
		{
			System.out.println("Product record not Deleted : " + rowAffected); 
		}
	
		 
		  */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Category : ");
		String category = sc.nextLine();
		System.out.println("Enter brand : ");
		String brand = sc.nextLine();
		System.out.println("Enter price : ");
		int price = sc.nextInt();
		System.out.println("Enter quantity_in_stock : ");
		int quantity_in_stock = sc.nextInt();
		System.out.println("Enter description : ");
		String description = sc.nextLine();
		sc.nextLine();
		
		ProductDao dao1 = new ProductDao();
		
		ProductBean pbean = new ProductBean(0,name,category,brand,price,quantity_in_stock,description);
		
		int  rowAffected = dao1.insertProduct(pbean);
		
		if (rowAffected > 0 ) 
		{
			System.out.println("product record successfully inserted : " + rowAffected); 
		} else 
		{
			System.out.println("product record not inserted : " + rowAffected); 
		}
		
		
		
		
	}
}
