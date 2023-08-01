package Lec_9;

import java.util.Scanner;

public class take_Input_output {
	
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		display(arr);
	}

}
