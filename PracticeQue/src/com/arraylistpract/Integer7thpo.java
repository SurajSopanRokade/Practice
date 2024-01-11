package com.arraylistpract;

import java.util.ArrayList;

//4.Create arraylist of 10 integers. Insert an element at 7th position.
public class Integer7thpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(34);
		list.add(56);
		list.add(18);
		list.add(13);
		list.add(19);
		list.add(134);
		list.add(89);
		list.add(33);
		list.add(46);
		
		list.set(6, 10000000);
		System.out.println(list);
	}

}
