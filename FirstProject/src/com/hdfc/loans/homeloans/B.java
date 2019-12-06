package com.hdfc.loans.homeloans;

public class B extends A
{
	public  void m1()
	{
		System.out.println("i am overriden m1 from Class B");
	}
	
	public void m2()
	{
		System.out.println("iam m2 from Class B");
	}

	public static void main(String[] args) 
	{
		A a=new A();  // hasA Relationship
		a.m1();
		
		B b=new B();
		b.m1();
		b.m2();
		
		A obj=new B();
		obj.m1();
		
		//B obj1=new A();
	}

}
