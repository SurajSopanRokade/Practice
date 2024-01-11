package Pract;

import java.util.Scanner;

public class DisarumUsingMethod {
	public int Count(int a) {
		int count = 0;

		while (a > 0) {
			a = a / 10;
			count++;
		}
		return count;
	}

	public boolean CheckNum(int num) {
		int rem;
		int sum = 0;
		int cnt = Count(num);
		int original = num;
		for (int i = 0; i != num;) {

			rem = num % 10;
			num = num / 10;
			int power = 1;
			for (int j = 1; j <= cnt; j++) {
				power = power * rem;
			}
			sum = sum + power;
			cnt--;
		}
		if (sum == original)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num = sc.nextInt();
		DisarumUsingMethod obj = new DisarumUsingMethod();
		boolean res = obj.CheckNum(num);
		if (res)
			System.out.println("Number is disarum");
		else
			System.out.println("Number is not disarum");

	}

}
