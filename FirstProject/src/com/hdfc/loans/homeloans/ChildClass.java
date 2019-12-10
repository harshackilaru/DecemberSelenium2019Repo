package com.hdfc.loans.homeloans;

public class ChildClass extends ParentClass
{
	
	public strictfp Number workhard()
	{
		System.out.println("Child :- wakeup anytime, goto bar.....");
		return 0;
	}
	
	public void love()
	{
		System.out.println("Child - iam in love....");
	}

	public static void main(String[] args)
	{
		ParentClass p=new ParentClass();
		//p.workhard();
		p.care();
		
		ChildClass c=new ChildClass();
		c.workhard();
		c.care();
		c.love();
		
	}
	
}
