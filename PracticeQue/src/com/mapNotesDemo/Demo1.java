package com.mapNotesDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(12, "Suraj");
		map.put(13, "Snehal");
		map.put(14, "Abhishek");
		map.put(15, "Sunish");
//		Set<Entry<Integer,String>> set = map.entrySet();
//		Iterator<Entry<Integer,String>> itr = set.iterator();
//		while(itr.hasNext()) {
//			Entry<Integer,String> ent = itr.next();
//			System.out.println(ent.getKey()+" "+ent.getValue());
//		}
		System.out.println("Before remove");
		System.out.println(map);
		System.out.println("After remove");
		map.remove(12);
		System.out.println(map);
	}

}
