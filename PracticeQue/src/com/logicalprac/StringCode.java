package com.logicalprac;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCode {
	public void check() {
		//String str ="java is a programming language";
		String str="abc sjhjdshf kfskjdh ";
		String str1[]=str.split(" ");
		String str2[]=str1;

		ArrayList <Integer> list = new ArrayList<>();
		for (int i=0; i<str1.length; i++) {
			char ch[]=str1[i].toCharArray();
			int code=0;	
			for (int j=0; j<ch.length; j++) {
			//	code = code+(ch[j]-96);
			//	code = code + (j+1);
			}
			list.add(code);

		}
		System.out.println(list);
		System.out.println(Arrays.toString(str1));
		
		for (int i=0 ;i<list.size(); i++) {
			String temp="";
			for (int j=i+1; j<list.size(); j++) {
				if(list.get(i)>list.get(j)) {
					
					temp=str2[i];
					str2[i]=str2[j];
					str2[j]=temp;
				}
					
			}			
		}
			for (String e : str2) {
				System.out.print(e+" ");
			}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCode s1 = new StringCode();
		s1.check();
	}

}
