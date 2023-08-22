package Lec_9;

public class Merge_Two_sorted_Array {
	
	public static void main(String[] args) {
		
		int arr1[] = {1, 3, 7, 9, 10};
		int arr2[] = {2, 5, 8};
		
		int i=0;
		int j=0;
		int k=0;
		int merge[] = new int[arr1.length+arr2.length];
		
		while(i<arr1.length && j<arr2.length){
		    if(arr1[i]<arr2[j]){
		        merge[k]=arr1[i];
		        i++;
		        k++;
		    }
		    else{
		        merge[k] = arr2[j];
		        j++;
		        k++;
		    }
		}
		while(i<=arr1.length-1){
		    merge[k] = arr1[i];
		    i++;
		    k++;
		}
		while(j<=arr2.length-1){
		    merge[k] = arr2[j];
		    j++;
		    k++;
		}
		for(int x=0;x<merge.length;x++){
		    System.out.print(merge[x]+" ");
		}
	}
}
