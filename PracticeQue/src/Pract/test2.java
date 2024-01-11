package Pract;
//11.	In continuation with question no 10. Do some validations for password entered by user as follows and display appropriate message to user. [3m]
//Validation 					            Message 
//If password length is less than 8			password must be 8 chars long.
//If password does not contain # or @ 	    at least one special @ or # character must be present.	
//If passwd does not contain number 0 – 9	    password must contain at least one digit.
//If password contains space			        password must not have space
//If password does not contain uppercase char	password must have at least one uppercase letter
//  	e.g.  if user enters password  tQ123 – message will be 
//	password must be 8 chars long. At least one special @ or # character must be present. 
//If user enters tq@12321 message will be – password must have at least one uppercase letter and so on.

import java.util.Scanner;

public class test2  {
	 public void check(String str) {
		 int count=0;
		 if (str.length()<8)
			 System.out.println("password must be 8 chars long");
		 else if ((str.contains("#")|| str.contains("@")==false))
		 	 System.out.println("at least one special @ or # character must be present.");
		 else if ((str.contains("0")||str.contains("1")||str.contains("2")||str.contains("3")||str.contains("4")
				 ||str.contains("5")||str.contains("6")||str.contains("7")||str.contains("8")||str.contains("9"))==false)
			 System.out.println("password must contain at least one digit.");
		 else if (str.contains(" "))
			 System.out.println("password must not have space");
		 else if (true) {
			 for (int i=0; i<str.length(); i++) {
				 for (int j=65; j<=90; j++) {
					 if (str.charAt(i)==j)
						 count=1;
					 
				 }
			 }
			 if (count==0)
				 System.out.println("password must have at least one uppercase letter");
		 }
		 
	 }
	 
	public static void main(String[] args){
		String username="raj";
		String password="Suraj@4375";
		test2 t1 = new test2();
		
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		do
		{
		
		System.out.println("Please enter username");
		String name=sc.next();
		System.out.println("Please enter Password");
		String pass=sc.next();
		t1.check(pass);
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
		 
		  
		   

	
		 