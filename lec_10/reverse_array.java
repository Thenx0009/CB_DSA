package lec_10;

import java.util.Scanner;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {4,5,1,2,8,9,10};
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
	public static void reverse(int arr[]) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
