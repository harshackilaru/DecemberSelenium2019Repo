package com.hdfc.loans.homeloans;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a =new ArrayList<String>();
		a.add("kosmik");
		a.add("syansys");
		a.add("Oracle");
		a.add("Oaktech");
		
		System.out.println(a);
		ListIterator<String> val = a.listIterator();
		while(val.hasNext())
		{
			String var = val.next();
			if(var.equals("Oracle"))
				val.set("carrier");
			else
				val.remove();
		}
		
		System.out.println(a);
	}

}
