package com.Vehicle;

public class Vehicle {

	private int id;
	private String name,colour;
	private double price;
	private static double discount;
	
	public Vehicle(int id, String name, String colour, double price) {
	
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.price = price;
	}
	
	
	static {
		discount = 10000;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "id= "+id+"  name= "+name+"  colour= "+colour+"  price= "+price+"  Discount= "+discount;
	}
	
	
	
	
	
}
