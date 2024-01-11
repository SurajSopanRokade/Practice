package Pract;

import java.util.Scanner;

public class CalculateHCFofTwoNum {
	public int hcfOfNum(int a, int b) {
		int hcf = 1;

		for (int i = 1; i < 10; i++) {
			{
				for (int j = 2; j < 10; j++) {
					if (a != 0 && b != 0)
						if (a % j == 0 && b % j == 0) {
							hcf = hcf * j;
							a = a / j;
							b = b / j;
							break;
						}
				}

			}

		}
		return hcf;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Enter num1");
		num1 = sc.nextInt();
		int num2;
		System.out.println("Enter num2");
		num2 = sc.nextInt();
		CalculateHCFofTwoNum obj = new CalculateHCFofTwoNum();
		int res = obj.hcfOfNum(num1, num2);
		System.out.println(" HCF = " + res);
	}

}
