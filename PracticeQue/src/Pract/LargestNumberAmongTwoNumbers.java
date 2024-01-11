package Pract;

public class LargestNumberAmongTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		a=453;
		b=567;
		c=45;
		
		if (a>b)
		  if (a>c)
		  {
			  System.out.println(a);
		  }
		  else
		  {
			  System.out.println(c);
		  }
		else
		  if (b>c)
		  {
			  System.out.println(b);
		  }
		  else
		  {
			  System.out.println(c);
		  }
	}	
	}