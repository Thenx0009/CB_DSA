package Generic;

public class generic_demo {

	public static void main(String[] args) {
		
		Integer arr[] = {10,20,30,40,50};
		Display(arr);
		
		String arr1[] = {"Ram","Shyam" ,"Raj","Riya","Rahul"};
		Display(arr1);
	}
	public static <T>void Display(T arr[]) {//we made the function generic
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
//	public static void Display(String arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	}
//	public static void Display(char arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	}
}
