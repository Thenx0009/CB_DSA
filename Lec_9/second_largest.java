package Lec_9;
import java.util.*;
public class second_largest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];//[1 2 4 7 7 5 ]
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		int largest = arr[0];
		int sec_largest = Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++){
		    if(arr[i]>largest){
		        sec_largest = largest;
		        largest = arr[i];
		    }
		    else if(arr[i]<largest && arr[i]>sec_largest){
		        sec_largest = arr[i];
		    }
		}
		System.out.println(sec_largest);
	}

}
