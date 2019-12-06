package com.hdfc.loans.homeloans;

public class VaribaleTypes 
{
	 // primitive variable
	
	int x=100; //instance (or) non-static (or) global variable
	static String cname="prolifics"; // static (or) global variable
	static VaribaleTypes obj;
	
	
	public void m7()
	{
		int x=200;  // local variable

		System.out.println(this.x);
		System.out.println(cname);
	}
	
	public static void m8()
	{
		
		obj=new VaribaleTypes();
		System.out.println(obj.x);
		System.out.println(VaribaleTypes.cname);
	}
	

	public static void main(String[] args) 
	{
		obj=new VaribaleTypes();  // reference
		System.out.println(obj.x);
		System.out.println(VaribaleTypes.cname);

	}

}
