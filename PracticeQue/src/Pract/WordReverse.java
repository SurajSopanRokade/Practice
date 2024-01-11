package Pract;

import java.util.Arrays;

//25.  Write a Java program to reverse order of words in a given string.
public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="My Name Is Suraj";
		String str1[]=str.split(" ");
		String str2[]= new String [str1.length];
		int u=0;
		
		for (int i=str1.length-1; i>=0; i--) {
			str2[u++]=str1[i];
		}
		
		String str5="";
		
		for (int i=0; i<str2.length; i++) {
			int y=0;
			char ch[]=str2[i].toCharArray();
			char ch1[]= new char [str2[i].length()];
			for (int j=str2[i].length()-1; j>=0; j--) {
				ch1[y++]=ch[j];
				
			}
			str5=str5+Arrays.toString(ch1);
			
			
		}
		System.out.print(str5);
	}

}
