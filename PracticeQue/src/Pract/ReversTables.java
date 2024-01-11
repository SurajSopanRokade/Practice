package Pract;

import java.util.Scanner;

public class ReversTables {
	public void tables(int a) {
		for (int i = 10; i > 0; i--) {
			System.out.print("[*-* "+a * i+" *-*]");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		ReversTables obj = new ReversTables();
		obj.tables(num);

	}

}
