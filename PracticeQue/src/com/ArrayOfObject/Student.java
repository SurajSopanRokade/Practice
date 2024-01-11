package com.ArrayOfObject;

public class Student {
	int id;
	String name;
	
	Student()
	{
		id=0;
		name="";
	}
	Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arr[] = new Student[4];
		arr[0]= new Student (1,"Suraj");
		arr[1]= new Student (2,"Abhi");
		arr[2]= new Student (3,"Snehal");
		arr[3]= new Student (4,"Sunish");
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(" Element at " + i + "\n" + " Id = " + arr[i].id + "\n" + " Name = " +
		arr[i].name);
		}
		
	}

}
