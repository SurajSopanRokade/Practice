package com.arraylistpract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//6.Let employee class have a department object. 
//Iterate through aarraylist of employees.
//7.Use copy method of collections class to make a copy of given arraylist 
//of employees. Check if it creates shallow copy or deep copy. 
//Check if department objects are also copied.
//9.Sort arraylist of employees on employee names using comparable interface.
//10.Sort arraylist of employees on department names using comparator interface.
//11.Create arraylist ‘arrList’ within an arraylist. 
//Use contains and containsall method to check if given element 
//and arraylists are present in ‘arrList’
public class Employee implements Comparable<Employee> {
	int empid;
	String ename;
	int exp;
	Department dep;
	
	Employee(){
		empid=0;
		ename="";
		exp=0;
		dep=null;
	}
	Employee(int empid, String ename, int exp, Department dep){
		this.empid=empid;
		this.ename=ename;
		this.exp=exp;
		this.dep=dep;
	}
	public void setEmpid(int empid) {
		this.empid=empid;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public void setExp(int exp) {
		this.exp=exp;
	}
	public void setDep(Department dep) {
		this.dep=dep;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEname() {
		return ename;
	}
	public int getExp() {
		return exp;
	}
	public Department getDep() {
		return dep;
	}
	public String toString() {
		return "Employee id "+ empid + " Employee name " + ename + " Exp " + exp + " Department "+dep+"\n";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"Suraj", 12, new Department(102,"Maths"));
		Employee e2 = new Employee(2,"Abhishek", 13, new Department(103,"Biology"));
		Employee e3 = new Employee(3,"Snehal", 17, new Department(104,"Astro"));
		Employee e4 = new Employee(4,"Sunish", 19, new Department(105,"Physics")); 
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Iterator <Employee> itr = list.iterator();
//		while (itr.hasNext()) {
//			Employee e = itr.next();
//			System.out.println("Emp id : "+e.empid+ " Emp name : "+e.ename+ " Exp : "+e.exp);
//			Department d = e.dep;
//			System.out.println("*Dept id "+d.depid+" *Dept name "+d.dname);
//			System.out.println("_________________________________________________________");
//		}
//		ArrayList<Employee> list12 =  new ArrayList<Employee>(Collections.nCopies(list.size(), null));
//		Collections.copy(list12, list);
//		System.out.println("Before change");
//		System.out.println(list);
//		e1.dep.dname="Scientist";
//		System.out.println("After change departname of first employee");
//		System.out.println(list12);//It creates deepcopy of list because Departname of first list didnt change.
//		Collections.sort(list);
//		System.out.println(list);
		EmpComp m1 = new EmpComp();
		Collections.sort(list,m1);
		System.out.println(list);
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.ename.compareTo(o.ename);
	}
	

}
