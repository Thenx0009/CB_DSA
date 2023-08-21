package Lec_9;

public class BinarySearch_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 5, 8, 9, 12, 14, 15, 16, 17 };
		int k = 100;
		System.out.println(BinarySearch(arr, k));
	}

	public static int BinarySearch(int arr[], int k) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == k) {
				return mid;
			}

			else if (arr[mid] < k) {
				low = mid + 1;
			} 
			else {
				high = mid - 1;
			}
		}
		return -1;
	}

}
