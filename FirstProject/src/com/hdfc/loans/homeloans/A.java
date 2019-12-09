package com.hdfc.loans.homeloans;

public class A 
{
	int x=10,y=20,z;
	
	public  void m1()
	{
		System.out.println("i am m1 from Class A");
	}
	
	public void add()
	{
		z=x+y;
		System.out.println("Add of A & A is : " + z);
	}

	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
	}

}
