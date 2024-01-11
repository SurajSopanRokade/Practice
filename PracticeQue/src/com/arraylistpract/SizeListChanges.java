package com.arraylistpract;

import java.util.ArrayList;

//1. Show in program, that size of an arraylist dynamically changes
public class SizeListChanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(12);
		list.add(45);
		list.add(67);
		System.out.println("Before : "+list);
		list.add(1,90);//Add element
		System.out.println("After add : "+list);
		list.remove(3);//remove element
		System.out.println("After remove : "+list);
	}

}
