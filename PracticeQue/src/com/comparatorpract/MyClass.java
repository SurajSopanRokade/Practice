package com.comparatorpract;

import java.util.Arrays;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intArray[]= {2,3,1};
		Arrays.sort(intArray, new Sort());
		for (int i:intArray) {
			System.out.print(i+" ");
		}
	}

}
