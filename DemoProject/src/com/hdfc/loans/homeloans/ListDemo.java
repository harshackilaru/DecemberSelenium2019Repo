package com.hdfc.loans.homeloans;

import java.util.ArrayList;

public class ListDemo
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a =new ArrayList<Object>();
		a.add(10);
		a.add("ravilella");
		a.add(12.34f);
		a.add(10);
		a.add(20);
		a.add(30);
		
		System.out.println(a);
		
		System.out.println(a.get(1));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.subList(1, 4));
		System.out.println(a.contains(200));
		System.out.println(a.hashCode());
		a.set(1, "keerthan");
		System.out.println(a);
		a.add(1, "vmware");
		System.out.println(a);
		System.out.println(a.indexOf(30));
		a.remove(0);
		System.out.println(a);
		a.clear();
		System.out.println(a);
	}

}
