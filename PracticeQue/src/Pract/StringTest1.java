package Pract;

import java.util.Arrays;

//Q1] Given a string, reverse all the words which have odd length. The even length words are not changed.
//
//Examples
//reverseOdd("Bananas") ➞ "sananaB"
// 
//reverseOdd("One two three four") ➞ "enO owt eerht four"
// 
//reverseOdd("Make sure uoy only esrever sdrow of ddo length")
//➞ "Make sure you only reverse words of odd length"
public class StringTest1 {
	public void reverse(String n) {
		//String str5="";
		String str [] = n.split(" ");
		String str1 [] = new String[str.length];
		for (int i=0; i<str.length; i++) {
			if (str[i].length()%2!=0) {
				 char ch[]=str[i].toCharArray();
				 char ch1[]= new char [str[i].length()];
				char temp=' ';
				int u=0;
				for (int j=ch.length-1; j>=0; j--) {
					if(u<ch.length/2) {
						temp=ch[u];
						ch[u]=ch[j];
						ch[j]=temp;
					}
					u++;
					
				}
				String str5 = new String(ch);
				str1[i]=str5;
			}
			else if (str[i].length()%2==0)
				str1[i]=str[i];
		
			
			
		}
		
		System.out.println(Arrays.toString(str1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "One two three four";
		StringTest1 s1 = new StringTest1();
		s1.reverse(str);
	}

}
