package Pract;
//Q2] Write a function that returns the number of ways a person can climb n stairs,
//where the person may only climb 1 or 2 steps at a time.
//
//To illustrate, if n = 4 there are 5 ways to climb:
// 
//[1, 1, 1, 1]
//[2, 1, 1]
//[1, 2, 1]
//[1, 1, 2]
//[2, 2]
// 
//Examples:
// 
//Ways(1) ➞ 1
// 
//Ways(2) ➞ 2
// 
//Ways(5) ➞ 8
// 
//*A staircase of height 0 should return 1.

public class StaresClimb {
	public int climb(int n) {
		int b=1;
	       int c=2;
	       int d=0;
	       if (n==0) {
	    	   System.out.println("1");
	    	   return d;
	       }
	       else if (n==1) {
	    	   System.out.println("1");
	    	   return b;
	       }
	       else if (n==2) {
	    	   System.out.println("2");
	    	   return c;
	       }
	       else if (n>2) {
		   for (int i=3; i<=n; i++)
		   {
			   
			   d=b+c;
			   b=c;
			   c=d;
		   }
		  
	       }
		return d;  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaresClimb s1 = new StaresClimb();
		int res =s1.climb(9);
		System.out.println(res);
	}

}
