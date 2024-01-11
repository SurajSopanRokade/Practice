package Pract;
import java.util.Scanner;
public class DisplayLargestAndSmallest {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		char ch='y';
		int b=0;
		int c=100000;
		
		do
		{int num;
		System.out.println("Enter num");
		num=sc.nextInt();
		
		if (num>b)
		
			b=num;
		if (num<=c)
			c=num;
			
		System.out.println("If you want to continue press y");
		ch=sc.next().charAt(0);
		}while (ch=='y');	
		System.out.println("Biggest number is = " + b);
		if (c!=0) {
		System.out.println("Smallest number is = " + c);}
	}

}
