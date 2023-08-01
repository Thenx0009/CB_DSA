package Lec_9;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int key = sc.nextInt();
		int index = search(arr,key);
		if(index == -1) {
			System.out.println("key not found");
		}
		else {
			System.out.println("key is found at index "+index);
		}
	}
	public static int search(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
