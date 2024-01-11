package com.array;

public class RightShiftArray {
	public static void rightShift() {
		int arr[] = { 5, 6, 7, 3, 2, 8, 9 };
		int n = 1;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rightShift();
	}

}
