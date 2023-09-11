package Recursion2;

import java.util.*;

public class All_Occourences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 13, 7, 5, 3, 4, 5, 6, 3, 9, 3, 100 };
		int arr3[] = all(arr, 0, 3, 0);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

	public static int[] all(int arr[], int i, int item, int fsf) {

		if (i == arr.length) {
			return new int[fsf];
		}
		if (arr[i] == item) {
			int arr2[] = all(arr, i + 1, 3, fsf + 1);
			arr2[fsf] = i;
			return arr2;
		} 
		else {
			int arr2[] = all(arr, i + 1, 3, fsf);
			return arr2;
		}
	}

}
