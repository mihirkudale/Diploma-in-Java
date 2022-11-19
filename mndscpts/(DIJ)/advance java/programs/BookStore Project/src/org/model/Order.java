package org.model;

public class Order {
	private String Order_Id,Book_Id;
	private String Cust_Name,Phone_No,Address,Order_Date,Quantity;
	public String getOrder_Id() {
		return Order_Id;
	}
	public void setOrder_Id(String order_Id) {
		Order_Id = order_Id;
	}
	public String getBook_Id() {
		return Book_Id;
	}
	public void setBook_Id(String book_Id) {
		Book_Id = book_Id;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}
	public String getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(String phone_No) {
		Phone_No = phone_No;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getOrder_Date() {
		return Order_Date;
	}
	public void setOrder_Date(String order_Date) {
		Order_Date = order_Date;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	
}
