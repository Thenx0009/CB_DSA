package lec_10;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,4,2,1};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void bubbleSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {//number of turns
			for(int j=0;j<arr.length-i;j++) {//loop to implement swapping
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
