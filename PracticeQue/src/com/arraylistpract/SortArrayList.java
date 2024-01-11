package com.arraylistpract;

import java.util.ArrayList;
import java.util.Collections;

//8.        Sort arraylist of Strings.
public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<>();
		str.add("Suraj");
		str.add("Yogesh");
		str.add("Abhishek");
		str.add("Sunish");
		str.add("Snehal");
		str.add("Maruti");
		str.add("Adersh");
		
		Collections.sort(str);
		System.out.println(str);
		Collections.reverse(str);
		System.out.println(str);
	}

}
