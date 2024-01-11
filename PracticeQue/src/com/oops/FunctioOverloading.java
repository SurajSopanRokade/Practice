package com.oops;

public class FunctioOverloading {
	String name;
	int age;
	int id;
	
	public void printInfo(String name)
	{
		System.out.println("Name is " + name);
		
	}
	public void printInfo(int age)
	{
		System.out.println("Age is " + age);
	}
	public void printInfo(String name, int age, int id)
	{
		System.out.println("name is "+name+" age is "+age+" id is "+id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctioOverloading s1 = new FunctioOverloading();
		s1.name="Suraj";
		s1.age=27;
		s1.id=1;
		
		s1.printInfo(s1.name, s1.age, s1.id);
		
	}

}
