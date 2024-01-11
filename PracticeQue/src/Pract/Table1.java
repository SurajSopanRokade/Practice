package Pract;

public class Table1 {
	
	    public static void main(String[] args) {
	    
	    String str = "abc";
	    String str1 = new String("abcd");
	    String str2 = "abcd";
	    System.out.println(str.hashCode());
	    System.out.println(str1.hashCode());
	    System.out.println(str2.hashCode());
	    System.out.println(str1==str2);
	    
	    
//	    String s1="abc";
//	    StringBuffer s2 = new StringBuffer(s1);
//	    System.out.println(s1.equals(s2));
//	    	String str1 ="abc";
//	    	String str2 =new String("abc");
//	    	str2.intern();
//	    	System.out.println(str1==str2);
//	    	String str ="Java String";
//	    	System.out.println(str.substring(5,3));
//	    
	    }  
	}


