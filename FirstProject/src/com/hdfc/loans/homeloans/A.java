package com.hdfc.loans.homeloans;

public class A 
{
	int x=100,y=200,result;
	
	public  void m1()
	{
		System.out.println("i am m1 from Class A");
	}
	
	public void add()
	{
		result=x+y;
		System.out.println("Addition of X & Y is : " + result);
	}

	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
	}

}
