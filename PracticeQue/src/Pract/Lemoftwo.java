package Pract;

public class Lemoftwo {
	public void check(int a, int b) {
		int lcm;
		if (a>b)
			lcm=a;
		else
			lcm=b;
		for (int i=2; i>0; i++) {
			if(lcm%a==0 && lcm%b==0) {
				System.out.println("Lcm is " + lcm);
				break;
			}
			lcm++;
		}
//		int rem=0;
//		if(a>b && a/b==2) {
//			
//			System.out.println("LCM "+ a);
//		}
//		else if(b>a && b/a==2) {
//			
//			System.out.println("LCM "+ b);
//		}
//		else if(a>b) {
//			for (int i=2; i>0; i++) {
//				if (b%i==0) {
//				rem=b/i;
//				System.out.println("LCM "+ a*i);
//				break;
//				}
//			}
//			
//		}
//		else if(b>a) {
//			for (int i=2; i>0; i++) {
//				if (a%i==0) {
//				System.out.println("LCM "+ b*i);
//				break;
//				}
//			}
//			
//		}
//		else if(b>a || a>b)
//			System.out.println("LCM "+ (a*b));
//			
//		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lemoftwo l1 = new Lemoftwo();
		l1.check(3, 11);
	}

}
