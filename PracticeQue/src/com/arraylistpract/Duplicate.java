package com.arraylistpract;

import java.util.ArrayList;
import java.util.Arrays;

//5.Create arraylist of characters. Remove duplicate characters from the list. 
//E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}
//Output should be {‘d’ , ‘g’ , ‘h’}
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> list = new ArrayList<>(Arrays.asList('d','g','h','d','d','h','g'));
		for (int i=0; i<list.size(); i++) {
			for (int j=i+1; j<list.size(); j++) {
				if (list.get(i)==list.get(j)) {
					list.remove(j);
					j--;
				}
					
			}
		}
		System.out.println(list);
	}

}
