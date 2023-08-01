package Lec_9;

import java.util.Scanner;

public class index_of_small_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {5,4, 9, 6, 2};
		System.out.print(index(arr));
		
	}
	public static int index(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==min) {
				return j;
			}
		}
		return -1;
	}

}
