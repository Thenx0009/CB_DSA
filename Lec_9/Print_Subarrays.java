package Lec_9;

public class Print_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,8,4,3,7,10};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
