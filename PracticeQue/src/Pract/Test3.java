package Pract;

	public class Test3 {
		public void pattern(int n) {
			int a=0;
//			for (int i=0; i<n; i++) {
//				for (int j=0; j<n-i; j++) {
//					System.out.print((a)+" ");
//					a++;
//				}
//				System.out.println();
//			}
			for (int i=n; i>=0; i--) {
				for (int j=0; j<n; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t1 = new Test3();
		t1.pattern(4);
	}

}
