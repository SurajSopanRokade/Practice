package com.arraylistpract;

import java.util.ArrayList;

//2.Create aarraylist of integers. Add first 50 odd numbers to arraylist.
public class AddFirst50odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count=0;
		for (int i=0; count<50; i++) {
			if (i%2!=0) {
				list.add(i);
				count++;
			}
		}
		System.out.println(list);
	}

}
