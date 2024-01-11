package com.Static;

public class StaticMethod {
	int id;
	String name;
	static String college="ETS";
	
	public static void change()
	{
		college="SCOE";
	}
	StaticMethod()
	{
		id=0;
		name="";
		
	}
	
	StaticMethod(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public String toString()
	{
		return " ID " + id +"\n"+ " name " + name +"\n"+ " College " +college;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod.change();
		StaticMethod  s1 = new StaticMethod ();
				System.out.println(s1);
				
				StaticMethod  s2 = new StaticMethod (1, "Suraj");
				System.out.println(s2);
				
				StaticMethod  s3 = new StaticMethod (2, "Abhi");
				System.out.println(s3);
	}

}
