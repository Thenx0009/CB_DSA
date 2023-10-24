package Sortings;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 3, 2, 15, 7, 1 };
		int low = 0;
		int high = arr.length-1;
		int ans[] = merge_sort(arr,low,high);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

	public static int[] merge_sort(int arr[],int low,int high) {
		if(low==high) {
			int a[] = new int[1];
			a[0] = arr[low];
			return a;
		}
		int mid = (low+high)/2;
		int[] fs = merge_sort(arr,low,mid);
		int[] ss = merge_sort(arr,mid+1,high);
		return merge_two_sorted_arrays(fs,ss);
	}

	public static int[] merge_two_sorted_arrays(int arr1[], int arr2[]) {
		int merge[] = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				merge[k] = arr1[i];
				i++;
				k++;
			} else {
				merge[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			merge[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			merge[k] = arr2[j];
			j++;
			k++;
		}
		return merge;
	}

}
