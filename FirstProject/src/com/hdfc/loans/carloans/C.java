package com.hdfc.loans.carloans;

import com.hdfc.loans.homeloans.A;
import com.hdfc.loans.homeloans.B;

public class C extends A
{
	
	public void m3()
	{
		System.out.println("iam m3 from Class C");
	}

	public static void main(String[] args) 
	{
		B b=new B();
		b.m1();
		b.m2();
		
		C c=new C();
		c.m1();
		c.m3();

	}

}
