package com.hdfc.loans.homeloans;

public class OverloadingDemo 
{
	
	
	  public void m1(int i) 
	  { 
		  System.out.println(i);
	  }
	 
	
	
	 public void m1(float j) 
	 { 
		 System.out.println(j); 
	}
	 
	
	public void m1(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) 
	{
		OverloadingDemo obj=new OverloadingDemo();
		obj.m1(100);
		obj.m1(23.34f);
		obj.m1("ravilella");
	}

}
