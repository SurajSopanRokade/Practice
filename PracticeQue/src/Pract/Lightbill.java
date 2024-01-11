package Pract;

public class Lightbill {

  public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bill;
		int amount;
		amount=321;
		if (amount<=100)
		{
			System.out.println(bill=amount*5);
		}
		if (amount<=300)
		{
			System.out.println(bill=500+(amount-100)*8);
		}
		if (amount>300)
		{
			System.out.println(500+1600+(amount-300)*10);
		}

	}

}
