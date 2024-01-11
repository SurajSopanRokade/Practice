package Pract;

public class Frequency {
	public static void calculate() {
		int arr[]= {1,4,4,5,5,6,5,4,5,6,7,8};
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='$')
				continue;
			    count=1;
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]='$';
				}
					
			}
			if(count==1)
				System.out.println("Unique number " + arr[i]);
			else if (count>1)
				System.out.println("Element " + arr[i] + " Count " + count);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate();
	}

}
