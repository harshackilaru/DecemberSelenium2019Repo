package com.hdfc.loans.homeloans;

public class Calculations 
{
	int a,b,c;
	
	public Calculations(int a, int b) 
	{
		this.a=a;
		this.b=b;
	}

	public void add()
	{
		c=a+b;
		System.out.println("Addition of A & B is :" + c);
	} 
	
	public void sub()
	{
		c=a-b;
		System.out.println("Sub of A & B is :" + c);
	} 
	
	public static void main(String[] args) 
	{
		Calculations c1=new Calculations(100,200);
		c1.add();
		c1.sub();
		
		Calculations c2=new Calculations(10,20);
		c2.add();
		c2.sub();
	}

}
