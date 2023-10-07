package ArrayList;

import java.util.*;

public class Arrays_Intersection_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int arr2[] = new int[n];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		intersection(arr1,arr2);
	}
	public static void intersection(int arr1[],int arr2[]){
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		List<Integer> ll = new ArrayList<>();
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i]==arr2[j]) {
				ll.add(arr1[i]);
				i++;
				j++;
			}
			else {
				j++;
			}
		}
		System.out.println(ll);
	}

}
