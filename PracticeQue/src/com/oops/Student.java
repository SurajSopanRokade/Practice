package com.oops;

public class Student {
     	
	String name;
	int id;
	Student()
	{
		
	}
	Student(Student s2)
	{
		this.name=s2.name;
		this.id=s2.id;
		
	}
   
	
	public void std()
	{
		System.out.println(this.name);
		System.out.println(this.id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name="Suraj";
		s1.id=1;
	    
		Student s2 = new Student(s1);
		s1.std();
	
		s2.std();
		
		
	}

}
