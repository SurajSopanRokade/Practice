package com.Containment;
//4. Create Employee class which has attributes (id, name, salary, dept,
//mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
//And mydate has (day, month, year).
//Display Employee information.
//Note. Containment using constructor and getter/setter
public class Dept {
	int id;
	String name;
	
	Dept(){
		id=0; 
		name="";
	}
	Dept(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return " Id "+ id +"\n"+" Name " + name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
