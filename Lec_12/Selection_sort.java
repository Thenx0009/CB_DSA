package Lec_12;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,9,4,6};
		selection(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void selection(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int mini = i; //index
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[mini]) {
					mini=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}
	}

}
