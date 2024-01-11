package com.array;

public class Frequrncy {
	public static void array() {
		System.out.println(1);
		int arr[]= {4,3,2,4,2,2,9,2,3,4};
		for (int i=0; i<arr.length; i++) {
			int count=0;
			for (int j=0; j<arr.length; j++) {
				if (i!=j && arr[i]==arr[j]) 
					count++;
				
			}
			if(count!=0) {
				boolean isNotCounted=true;
				for (int k=i-1; k>=0; k--) {
					if(arr[i]==arr[k])
						isNotCounted=false;
				}
			
			if(isNotCounted)
			System.out.println("Element "+arr[i] + " count " + (count+1));
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
	}

}
