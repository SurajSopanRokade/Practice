package Pract;
import java.util.Scanner;
public class FindGcd {
    public int findGcdOfNum(int a, int b)
    {   int pro=a*b;
   
    	int lcm = 1;
		for (int i = 1; i <= 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (a % j == 0 || b % j == 0) {
					if (a % j == 0 && b % j == 0) {
						a = a / j;
						b = b / j;
						lcm = lcm * j;
						break;
					} else if (a % j == 0) {
						a = a / j;
						lcm = lcm * j;
						break;
					} else if (b % j == 0) {
						b = b / j;
						lcm = lcm * j;
						break;
					}
				}

			}
		}
		int GCD=pro/lcm;
		return GCD;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num1;
		System.out.println("Enter num1");
		num1=sc.nextInt();
		int num2;
		System.out.println("Enter num2");
		num2=sc.nextInt();
		FindGcd obj = new FindGcd ();
		int res =obj.findGcdOfNum(num1, num2);
		
		
		System.out.println(res);

	}

}
