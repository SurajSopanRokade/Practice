package Pract;
import java.util.Scanner;
public class DecimalToBinary {
   public void DecToBin(int a)
   {   
	  while (a>0)
	  {   
		  int rem=a%2;
		  
		  a=a/2;
		  System.out.println(rem);
		 
		  
	  }
	 
	  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.println("enter num");
		num=sc.nextInt();
		DecimalToBinary obj = new DecimalToBinary();
		obj.DecToBin(num);
	}

}
