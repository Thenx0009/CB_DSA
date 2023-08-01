package Lec_9;

public class Arrays_swp_3 {
	
	public static void swap(int arr[],int other[]) {
		int temp[] = arr;
		arr=other;
		other=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int other[] = {100,200,300,400,500};
		System.out.println(arr[0]+" "+arr[1]);
		swap(arr,other);
		System.out.println(arr[0]+" "+arr[1]);
	}

}
