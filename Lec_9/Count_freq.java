package Lec_9;
import java.util.*;

public class Count_freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int arr[] = new int[n];
      	for(int i=0;i<n;i++){
        	arr[i] = sc.nextInt();
        }
      	int c[]=Count_Freq(arr,n);
      	for(int i=0;i<c.length;i++){
      	    System.out.print(c[i]+" ");
      	}
	}
	public static int[] Count_Freq(int arr[],int n){
	    int arr2[] = new int[11];
	    for(int k=0;k<11;k++){
	        int count = 0;
	        for(int i=0;i<arr.length;i++){
	            if(k==arr[i]){
	                count++;
	            }
	            arr2[k]=count;
	        }
	    }
	    return arr2;
	}

}
