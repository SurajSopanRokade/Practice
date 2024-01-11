package com.exception;

public class ExceptionDivideBy0 {
	public int divi() {
		int a=0;
		try {
		 a=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Ar");
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally");
		}
		return a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in main");
		ExceptionDivideBy0 e1= new ExceptionDivideBy0();
//		try {
		int res=e1.divi();
//		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
		System.out.println(res);
		System.out.println("I am at end....");
		
	}

}
