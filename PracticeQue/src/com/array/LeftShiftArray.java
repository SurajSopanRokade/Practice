package com.array;

public class LeftShiftArray {
	public static void leftshift() {
		int arr[]= {6,7,3,4,8,2,1};
		int n=2;
		int temp=0;
		for(int i=0; i<n; i++) {
			temp=arr[0];
			for(int j=0; j<arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leftshift();
	}

}
