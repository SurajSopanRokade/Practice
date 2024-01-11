package com.mappract;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new TreeMap<>();
		map.put(1, "Suraj");
		map.put(7, "Ansh");
		map.put(2, "Abhishek");
		map.put(4, "Sunish");
		
//		Set<Entry<Integer,String>> set = map.entrySet();
//		Iterator<Entry<Integer,String>> itr = set.iterator();
//		while(itr.hasNext()) {
//			Entry<Integer,String> ent = itr.next();
//			System.out.println(ent.getKey()+" "+ent.getValue());
//		}
//		Set<Integer> set = map.keySet();
//		Iterator<Integer> itr = set.iterator();
//		while(itr.hasNext()) {
//			int a=itr.next();
//			System.out.println(a+" "+map.get(a));
//		}
		System.out.println(map);
		Long s=23343242l;
		Long a=s;
//		int i =Integer.parseInt(s);
//		System.out.println(i/2);
//		Integer i =Integer.valueOf(s);
//		System.out.println(i/2);
//		
//		int a =Integer.parseInt(s);
//		System.out.println(a/2);
		
		
	}

}
