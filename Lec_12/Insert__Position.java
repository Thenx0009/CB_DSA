package Lec_12;

public class Insert__Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,0,3,8,9,4};
		Insert_Position(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void Insert_Position(int arr[]) {
		int item = arr[arr.length-1];
		int i=arr.length-2;
		while(i>=0 && arr[i] >= item) {
			arr[i+1] = arr[i];
			i--;
		}
		i++;
		arr[i]=item;
	}
}
