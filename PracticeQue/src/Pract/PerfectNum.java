package Pract;
import java.util.Scanner;
public class PerfectNum {
   public boolean perfectN(int a)
   {   int sum=0;
   	   int original=a;
	   for (int i=1; i<a; i++)
	   {
		   if (a%i==0)
			   sum=sum+i;
	   }
	   if (sum==original);
	   return true;
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num=sc.nextInt();
		PerfectNum obj = new PerfectNum();
		boolean res=obj.perfectN(num);
		if(res)
			System.out.println("Number is perfect num");
		else
			System.out.println("Number is not perfect num");
	}

}
