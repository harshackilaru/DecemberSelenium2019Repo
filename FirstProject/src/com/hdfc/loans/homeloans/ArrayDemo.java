package com.hdfc.loans.homeloans;

import java.util.Scanner;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		/*
		 * int[] a= {10,20,30,40,50};
		 * 
		 * for(int i=0;i<a.length;i++) { System.out.print("a["+i+"]=" + a[i] + "\n"); }
		 */
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter the array Size :"); int asize = sc.nextInt();
		 * 
		 * int[] a=new int[asize]; int sum=0;
		 * 
		 * System.out.println("Enter the array Elements :"); for(int i=0;i<a.length;i++)
		 * { a[i]=sc.nextInt(); sum=sum+a[i];
		 * 
		 * //System.out.print("a["+i+"]=" + a[i] + "\n"); }
		 * System.out.println("sum of aray is  :- " + sum);
		 */
		
		
		int[][] a=new int[2][2];
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		

	}

}
