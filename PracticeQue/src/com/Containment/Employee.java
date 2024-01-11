package com.Containment;
//4. Create Employee class which has attributes (id, name, salary, dept,
//mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
//And mydate has (day, month, year).
//Display Employee information.
//Note. Containment using constructor and getter/setter

public class Employee {
	int id;
	String name;
	double salary;
	Dept dep;
	MyDate date;
	Employee(){
		id=0;
		name="";
		salary=0;
		dep = new Dept();
		date = new MyDate();
	}
	Employee(int id, String name, double salary, Dept dep, MyDate date){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dep=dep;
		this.date=date;
	}
	public String toString() {
		return " Id "+ id +"\n"+" Name " + name +"\n"+ " Salary " + salary +"\n"+ " Department " + dep +"\n"+ " Date Of Joining " + date;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "Suraj", 23000,new Dept(1, "Science"), new MyDate(12,3,2022) );
		System.out.println(e1);
	}

}
