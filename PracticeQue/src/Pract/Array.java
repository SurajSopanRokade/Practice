package Pract;
import java.util.*;
public class Array {
	int size, number;
//	public void array()
//	{
//		int arr [] = new int[5];
//		arr[0]=12;
//		arr[1]=13;
//		arr[2]=14;
//		arr[3]=15;
//		arr[4]=16;
//		for (int i=0; i<5; i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
//	}
	public void array2()
	{    Scanner sc = new Scanner(System.in);
	      size=sc.nextInt();
		  int arr1[] = new int[size];
		for (int i=0; i<size; i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		for (int i=0; i<size; i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("Enter search value");
		int x=sc.nextInt();
		
		for (int i=0; i<arr1.length; i++)
		{
			if(x==arr1[i])
				System.out.println("x fount at " +i+ " location ");// Linear search
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array a1= new Array();
		
		a1.array2();
	}

}
