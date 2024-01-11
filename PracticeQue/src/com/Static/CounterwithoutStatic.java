package com.Static;

public class CounterwithoutStatic {
	static int count=0;
	
	CounterwithoutStatic()
	{
		count++;
		System.out.println("count = "+count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterwithoutStatic e1 = new CounterwithoutStatic();
		System.out.println("_____________________________________")	;
		CounterwithoutStatic e2 = new CounterwithoutStatic();
	}

}
