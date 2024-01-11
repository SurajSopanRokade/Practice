package Pract;

public class checkNumberIsPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int original;
		int revnum;
		int rem;
		num=12821;
		original=num;
		revnum=0;
		
		while (num!=0) {
			rem=num%10;
			num=num/10;
			revnum=revnum*10+rem;
		}
		if (revnum==original) {
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}

	}

}
