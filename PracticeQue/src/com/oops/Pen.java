package com.oops;

public class Pen {
	String colour;
	String type; // ballpen or jel pen
	
	public void blueprint()
	{
		System.out.println(this.colour);//use of this is to recognize which object is calling function.
		System.out.println(this.type);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1 = new Pen();
		p1.colour="black";
		p1.type="ballpen";
		
		Pen p2 = new Pen();
		p2.colour="blue";
		p2.type="jelpen";
		
		p1.blueprint();
		
		
	}

}
