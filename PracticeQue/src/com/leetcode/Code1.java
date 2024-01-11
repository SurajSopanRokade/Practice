package com.leetcode;

public class Code1 {
	public static void check() {
		String str="abciiidef";
		char [] ch = str.toCharArray();
		int count=0;
		for (int i=0; i<ch.length; i++) {
			
			for (int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j])
					ch[i]='$';
			}
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
			}
		}
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
