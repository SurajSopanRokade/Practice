package Pract;
import java.util.Scanner;
public class BinaryToDecimal {
	public int power(int c)
	
	{ 
		 for (int i=0; i<=c; i++)
		 {
			  c=c*2;
			System.out.println("c = " + c)  ;
		 }
		return c; 
	}
    public void binToDec(int a)
    {  int count=0;
       int sum=0;
    	while (a>0)
    	{
    		int rem=a%10;
    		 a=a/10;
    		 System.out.println("Rem = " +rem);
    		 System.out.println("Count = " + count);
    		 int pro=power(count);
    		 count++;
    		 
    		 rem=rem*pro;
    		 sum=sum+rem;
    		
    		System.out.println("A = " + a);
    	}
    	System.out.println("Sum = " + sum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num=sc.nextInt();
		BinaryToDecimal obj = new BinaryToDecimal();
		obj.binToDec(num);
	}

}
