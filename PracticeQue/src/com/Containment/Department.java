package com.Containment;
//1. WAP to have Department class created with id, name . Student class has
//roll, name and Department object should have id and name. Assign and
//print individual values in main method
public class Department {
	int id;
	String name;
	
	Department(){
		id=0;
		name="";
	}
	Department(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return " Id "+ id +"\n"+ " Name " + name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
