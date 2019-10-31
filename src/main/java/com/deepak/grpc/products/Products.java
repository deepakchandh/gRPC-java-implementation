//$Id$
package com.deepak.grpc.products;

public class Products {

	private int id;
	private String name;
	private int price;
	private int stock;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString(){
		return "ID "+this.getId()+" Name "+ this.getName() +" Price "+ this.getPrice()+ " Stock" + this.getStock(); 
	}
	
	
}
