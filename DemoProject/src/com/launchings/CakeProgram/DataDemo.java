package com.launchings.CakeProgram;

public class DataDemo 
{
	private String name;
	private String type;
	private int price;
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}




	public static void main(String[] args) 
	{
		DataDemo d=new DataDemo();
		System.out.println(d.name);
		System.out.println(d.type);
		System.out.println(d.price);
	}

}
