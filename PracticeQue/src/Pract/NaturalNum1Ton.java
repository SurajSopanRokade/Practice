package Pract;
import java.util.Scanner;
public class NaturalNum1Ton {
  public void naturalNum(int n)
  {
	  for (int i=1; i<=n; i++)
	  {
		  System.out.println(i);
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num=sc.nextInt();
		NaturalNum1Ton obj =new NaturalNum1Ton();
		obj.naturalNum(num);
	}

}
