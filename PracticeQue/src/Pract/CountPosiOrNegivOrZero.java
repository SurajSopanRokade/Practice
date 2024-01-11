package Pract;

import java.util.Scanner;

public class CountPosiOrNegivOrZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pos = 0;
		int neg = 0;
		int zero = 0;
		char ch = 'y';
		Scanner sc = new Scanner(System.in);

		do {

			int num;
			System.out.println("Enter the number");
			num = sc.nextInt();
			if (num > 0)
				pos++;
			if (num < 0)
				neg++;
			if (num == 0)
				zero++;

			System.out.println("If u want to continue please press y");
			ch = sc.next().charAt(0);
		} while (ch == 'y');
		System.out.println("Positive count = " + pos);
		System.out.println("Negative count = " + neg);
		System.out.println("Zeros count = " + zero);

	}
}
