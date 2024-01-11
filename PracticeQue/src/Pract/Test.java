package Pract;

import java.util.Scanner;

//10.	Create a hardcoded array of user objects. 
//User { String username , String passwd } . 
//Ask user to enter username and password. 
//Find out username and password entered by user are valid or not. 
//If username and password exists in array then its valid , otherwise not. 
//Display appropriate message. [1m]

public class Test  {
	public void ascending (String n[]){
		
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String username="raj";
			String password="4975";
			Scanner sc = new Scanner(System.in);
			int n=0;
			
			do
			{
			
			System.out.println("Please enter username");
			String name=sc.next();
			System.out.println("Please enter Password");
			String pass=sc.next();
			
			if (name.equals(username) && pass.equals(password)) {
				System.out.println("valid data");
				n=2;
			}
			else {
				System.out.println("Invalid data");
			System.out.println("Do you want to continue press 1");
			 n=sc.nextInt();
			}
			}while(n==1);
			
		}
}