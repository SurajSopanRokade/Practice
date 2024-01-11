package com.Static;

public class Demo {
	int sid;
	String sname;
	static String college = "SCOE";
	
	Demo(int sid, String sname )
	{
		this.sid= sid;
		this.sname=sname;
	}
	public String toString ()
	{
		return " Student id " + sid + "\n" + " Student name " + sname +"\n" + " College name " + college;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo(1,"Suraj");
		System.out.println(d1);
		
		Demo d2 = new Demo(2,"Abhi");
		System.out.println(d2);
	}

}
