package Pract;
import java.util.Scanner;
public class GenRandomNum {
   public void genRan(int a)
   {
	  for (int i=0; i<=a; i++)
	  {
		  if (i>0)
		  {
			  if (i%2!=0 && i%3!=0)
			  {
				  if (i%5==0)
					  System.out.print(i);
				  
			  }
			  else if (i%2==0)
				  System.out.print(i);
			  else if (i%3==0)
				  System.out.print(i);
			  else if (i==1)
				  System.out.print(i);
			  else 
				  System.out.print("0");
			 
			  
				  
		  }
			  
	  }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter num");
    int num=sc.nextInt();
    GenRandomNum obj = new GenRandomNum();
    obj.genRan(num);
	}

}
