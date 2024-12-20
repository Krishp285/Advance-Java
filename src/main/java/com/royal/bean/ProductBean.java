package com.royal.bean;


public class ProductBean 
{
    private int id ;
    private String name ;
    private String category ;
    private String brand ;
    private int price;
    private int quantity_in_stock ;
    private String description ;

	
	public ProductBean() 
	{
		
	}


	public ProductBean(int id, String name, String category, String brand, int price, int quantity_in_stock,
			String description) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.quantity_in_stock = quantity_in_stock;
		this.description = description;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuantity_in_stock() {
		return quantity_in_stock;
	}


	public void setQuantity_in_stock(int quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
}