package com.jsp.Exceptionspack;


class NullPointerException
{
	public  static void m1() 
	{
		
	
	String s=null;
	System.out.println("main starts");
	
	try {
	  System.out.println(s.length());// NullPointerException occur
	}catch(RuntimeException e) {
		System.out.println("Handled ");
		
	}
	System.out.println("main ends");
	
	}
}
class NumberFormatException
{
	public static void m2()
	{
		String s="a";
		System.out.println(s);
		int i=0;
		try {
		i=Integer.parseInt(s);
		}catch(Exception e) 
		{
			System.out.println("Handled");
			
		}
		System.out.println(i*2);
		
	}
}
	

public class UnCheckedExceptions {

	public static void main(String[] args)
	{
		NullPointerException.m1();
		
		System.out.println("___________________________________________________");
		
		NumberFormatException.m2();
		

	}

}
