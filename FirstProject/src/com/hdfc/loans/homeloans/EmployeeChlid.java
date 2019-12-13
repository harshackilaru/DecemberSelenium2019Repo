package com.hdfc.loans.homeloans;

public class EmployeeChlid extends Employee
{
	String location;

	public EmployeeChlid(String location) 
	{
		super(100,"kiran",12.234f);
		this.location=location;
		
		System.out.println(this.location);
	}
	
	
	public  void m1()
	{
	
	}

	public static void main(String[] args) 
	{
		EmployeeChlid ec=new EmployeeChlid("hyderabad");

	}

}
