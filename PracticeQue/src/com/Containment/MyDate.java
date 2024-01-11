package com.Containment;
//4. Create Employee class which has attributes (id, name, salary, dept,
//mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
//And mydate has (day, month, year).
//Display Employee information.
//Note. Containment using constructor and getter/setter
public class MyDate {
	int dd, mm, yy;
	
	MyDate(){
		dd=0;
		mm=0;
		yy=0;
	}
	MyDate(int dd, int mm, int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public String toString() {
		return dd+"/"+mm+"/"+yy;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
