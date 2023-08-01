package Lec_9;

import java.util.Scanner;

public class max_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		}
		System.out.println(max(arr));
	}
	public static int max(int arr[]){
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
}
