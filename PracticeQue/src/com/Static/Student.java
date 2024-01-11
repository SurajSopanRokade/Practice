package com.Static;

public class Student {

	int rollno;
	String name;
	static String college = "ITS";

	// static method to change the value of static variable
	static void change() {
		college = "BBDIT";
	}

	// constructor to initialize the variable
	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.change();//calling change method  
			    //creating objects  
			    Student s1 = new Student(111,"Karan");  
			    Student s2 = new Student(222,"Aryan");  
			    Student s3 = new Student(333,"Sonoo");  
		    //calling display method  
		    s1.display();  
			    s2.display();  
		    s3.display();  
			    }  
			  

	}


