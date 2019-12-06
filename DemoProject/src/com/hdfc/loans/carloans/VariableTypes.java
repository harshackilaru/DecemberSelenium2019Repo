package com.hdfc.loans.carloans;

public class VariableTypes 
{
	 // primitive variable
	int x=100; // instance (or) non-static (or) global 
	static String cname="vmware";  // static (or) global variable
	static VariableTypes obj;
	
	public void m1()
	{
		int x=200;  // local variable
		
		System.out.println(this.x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void m2()
	{
		obj=new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	
	
	public static void main(String[] args) 
	{
		obj=new VariableTypes();   // reference Variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}

}
