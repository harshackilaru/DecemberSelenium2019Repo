package com.hdfc.loans.homeloans;

import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h=new TreeMap<Integer, Integer>();
		h.put(100, 400);
		h.put(20, 200);
		h.put(35, 300);
		h.put(10, 100);
		h.put(40, 100);
		
		System.out.println(h);
		

	}

}
