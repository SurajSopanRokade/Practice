package com.arraylistpract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Employee1 {
	int eid,age,salary;
	String ename,desig;
	Department dept;
	
	public Employee1() {
		// TODO Auto-generated constructor stub
	}
	public Employee1(int eid, int age, int salary, String ename, String desig, Department dept) {
		super();
		this.eid = eid;
		this.age = age;
		this.salary = salary;
		this.ename = ename;
		this.desig = desig;
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", age=" + age + ", salary=" + salary + ", ename=" + ename + ", desig=" + desig
				+ ", dept=" + dept + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1(1,23,45000,"Suraj","SD",new Department(12,"IT"));
		Employee1 e2 = new Employee1(2,24,70000,"Abhishek","Tester",new Department(12,"IT"));
		Employee1 e3 = new Employee1(3,25,47000,"Amit","Manager",new Department(14,"Testing"));
		Employee1 e4 = new Employee1(4,26,48000,"Yogesh","Salesman",new Department(15,"Marketing"));
		
		ArrayList<Employee1> list = new ArrayList<Employee1>(Arrays.asList(e1,e2,e3,e4));
//		Employee1 e5 = new Employee1(5,24,49000,"Ram","Salesman",new Department(15,"Marketing"));
//		list.add(e5);
		Iterator <Employee1> itr = list.iterator();
		int max=0;
		Employee1 p = null;
		while(itr.hasNext()) {
			Employee1 e= itr.next();
//			System.out.println("Dep id : "+e.dept.depid+" Dep name : "+e.dept.dname);
//			System.out.println("Emp id : "+e.eid+" Emp name : "+e.ename+" Emp salary : " + e.salary);
//			if (max<e.salary) {
//				max=e.salary;
//				p=e;
//			}
//			if (e.dept.dname=="IT"&&e.salary<70000) {
//				System.out.println("Salary less than 70k : "+e.ename+" Salary is : "+e.salary);
//			}
			
		}
//		System.out.println("Employee name : "+ p.ename +","+ " Max salary : " + max);
		
	}

}
