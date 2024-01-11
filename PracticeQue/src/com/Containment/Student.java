package com.Containment;
//1. WAP to have Department class created with id, name . Student class has
//roll, name and Department object should have id and name. Assign and
//print individual values in main method

public class Student {
	int roll;
	String name;
	Department dept;
	Student(){
		roll=0;
		name="";
		dept=new Department();
	}
	Student(int roll, String name, Department d){
		this.roll=roll;
		this.name=name;
		dept=d;
	}
	public String toString() {
		return " Roll num "+roll+"\n" + " Name " + name + "\n"+" Department " + dept;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Suraj", new Department(1, "Science"));
		System.out.println(s1);
	}

}
