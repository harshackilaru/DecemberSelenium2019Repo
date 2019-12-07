package com.launchings.CakeProgram;

public class DemoChild 
{

	public static void main(String[] args) 
	{
		DataDemo d1=new DataDemo();
		d1.setName("BlackForest");
		d1.setType("Egg");
		d1.setPrice(800);
		
		System.out.println(d1.getName());
		System.out.println(d1.getType());
		System.out.println(d1.getPrice());

	}

}
