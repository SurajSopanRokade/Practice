package com.arraylistpract;
//6.Let employee class have a department object. 
//Iterate through aarraylist of employees.
public class Department {
	int depid;
	String dname;
	
	public Department() {
		depid=0;
		dname="";
	}
	public Department(int depid, String dname) {
		this.depid=depid;
		this.dname=dname;
	}
	public void setDepid(int depid) {
		this.depid=depid;
	}
	public void setDname(String dname) {
		this.dname=dname;
	}
	public int getDepid() {
		return depid;
	}
	public String getDname() {
		return dname;
	}
	public String toString() {
		return "DepId "+depid+" Depname "+dname;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
