package Sortings;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 5, 3, 1, 9, 4 };
		//idx=0-->1-->2
		//3 5 7 1 9 4
		//3 1 7 5 9 4
		//3 1 4 5 9 7
		Quick_sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Quick_sort(int arr[], int low, int high) {
		if (low >= high) {
			return;
		}
		int idx = partition(arr, low, high);
		Quick_sort(arr, low, idx - 1);
		Quick_sort(arr, idx + 1, high);
	}

	public static int partition(int arr[], int low, int high) {
		int lastelement = arr[high];
		int idx = 0;
		for (int i = 0; i < high; i++) {
			if (arr[i] <= lastelement) {
				// swapping of i with idx
				int T = arr[i];
				arr[i] = arr[idx];
				arr[idx] = T;
				idx++;
			}
		}
		// swapping of last element with idx
		int T = arr[idx];
		arr[idx] = arr[high];
		arr[high] = T;
		return idx;
	}

}
