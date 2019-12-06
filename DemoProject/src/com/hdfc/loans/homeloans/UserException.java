package com.hdfc.loans.homeloans;

import java.util.Scanner;

public class UserException extends Exception
{

	
	public UserException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) throws Exception 
	{		
		String str=null;
		
		Scanner sc=new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("Enter the String : ");
			str = sc.nextLine();
			try 
			{
				if (str.length() != 10)
				{
					throw new UserException("string should be 10 digit...");
				} 
				else 
				{
					System.out.println(str);
					break;
				}
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			} 
			finally 
			{
				System.out.println("iam fianl...");
			}
		}
		
		

	}

}
