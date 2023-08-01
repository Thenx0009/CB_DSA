package Lec_9;

public class swap_array_1 {
	
	public static int swap(int a,int b) {
		int c = a;
		a=b;
		b=c;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		System.out.println(arr[0]+" "+arr[1]);
		swap(arr[0],arr[1]);
		System.out.println(arr[0]+" "+arr[1]);
	}
}
