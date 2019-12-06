package com.hdfc.loans.homeloans;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);
		h.add(40);
		h.add(50);

		System.out.println(h);
		
		
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		lh.add(20);
		lh.add(10);
		lh.add(30);
		lh.add(10);
		lh.add(40);
		lh.add(50);

		System.out.println(lh);
	}

}
