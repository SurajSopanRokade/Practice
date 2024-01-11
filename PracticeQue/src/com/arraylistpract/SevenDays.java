package com.arraylistpract;

import java.util.ArrayList;

//3.Create aarraylist of string. Add 7 days to list ( Monday , Sunday etc)
//Remove elements from list for which string length is more than 7
public class SevenDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list = new ArrayList<>();
		list.add("Sunday");
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednsday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");
		
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).length()>7) {
				list.remove(i);
				i--;
			}	
		}
		System.out.println(list);
		
	}

}
