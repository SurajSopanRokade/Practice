package com.arraylistpract;

import java.util.Comparator;

public class EmpComp implements Comparator<Employee>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int compare(Employee o1, Employee o2) {
		return o1.ename.compareTo(o2.ename);
		
	}
}
