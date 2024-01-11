package com.arraylistpract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
//11.Create arraylist ‘arrList’ within an arraylist. 
//Use contains and containsall method to check if given element 
//and arraylists are present in ‘arrList’
//12.Iterate through arraylist using foreach.
public class Student {
	int sroll;
	String sname;
	ArrayList<Integer> marks;
	int percent;
	String grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sroll, String sname, ArrayList<Integer> marks) {
		super();
		this.sroll = sroll;
		this.sname = sname;
		this.marks = marks;
		this.percent=percentage();
		this.grade=grade();
	}
	
	public int getSroll() {
		return sroll;
	}

	public void setSroll(int sroll) {
		this.sroll = sroll;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public ArrayList<Integer> getMarks() {
		return marks;
	}

	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [sroll=" + sroll + ", sname=" + sname + ", marks=" + marks + ", percent=" + percent + ", grade="
				+ grade + "]";
	}

	public int percentage() {
		Iterator <Integer> itr = marks.iterator();
		int sum=0;
		while(itr.hasNext()) {
			sum=sum+itr.next();
		}
		return percent=sum/5;
	}
	public String grade() {
		if (percent>90)
			return "A";
		if (percent>80)
			return "B";
		if (percent>70)
			return "C";
		if (percent>60)
			return "D";
		return grade;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1= new ArrayList<>(Arrays.asList(78,89,90,97,78));
		Student s1 = new Student(1,"Suraj",l1);
		
		ArrayList<Integer> l2= new ArrayList<>(Arrays.asList(67,89,40,97,78));
		Student s2 = new Student(2,"Abhishek",l2);
		
		ArrayList<Integer> l3= new ArrayList<>(Arrays.asList(83,84,70,87,38));
		Student s3 = new Student(3,"Amit",l3);
		
		ArrayList<Integer> l4= new ArrayList<>(Arrays.asList(68,79,60,87,68));
		Student s4 = new Student(4,"Raj",l4);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
//		System.out.println(list.contains(l3));
		
		Iterator <Student> itr = list.iterator();
		while(itr.hasNext()) {
			Student t1=itr.next();
			System.out.println("Name : "+t1.sname +","+" Roll no : "+ t1.sroll);
			System.out.println("Grade : "+t1.grade+" "+" Percent : "+t1.percent);
		}
	}

}
