package Recursion2;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,3,2,15,7,1};
		int ans[] = merge(arr,0,arr.length-1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	
	public static int[] merge(int arr[],int low,int high) {
		int mid = (low+high)/2;
		if(low==high) {
			int a[] = new int[1];
			a[0] = arr[low];
			return a;
		}
		int fs[] = merge(arr,low,mid); //first sorted half
		int ss[] = merge(arr,mid+1,high);//second sorted half
		return merge_two_sorted_arrays(fs,ss);
	}
	
	public static int[] merge_two_sorted_arrays(int arr1[],int arr2[]) {
		int merge[] = new int[arr1.length+ arr2.length];
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				merge[k] = arr1[i];
				i++;
				k++;
			}
			else {
				merge[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i<=arr1.length-1) {
			merge[k] = arr1[i];
			i++;
			k++;
		}
		while(j<=arr2.length-1) {
			merge[k]= arr2[j];
			j++;
			k++;
		}
		return merge;
	}

}
