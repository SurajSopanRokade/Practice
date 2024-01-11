package Pract;

public class calculatenumberofnotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		int num;
		num=7525;
		if (num>1000) 
		{
			System.out.print("amount 1000 notes=");
		}
		{
			System.out.println(amount=num/1000);
		}
		num=num%1000;
		if (num>500) 
		{
			System.out.println("amount 500 notes=");
		}
		{
			System.out.println(amount=num/500);
		}
		num=num%500;
		if (num>20) 
		{
			System.out.println("amount 20 notes=");
		}
		{
			System.out.println(amount=num/20);
		}
		num=num%20;
	 
		
			System.out.println("remaining rupees =");
		
		
			System.out.println(num);
		

	}

}
