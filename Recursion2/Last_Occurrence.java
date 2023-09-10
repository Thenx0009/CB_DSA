package Recursion2;

public class Last_Occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,13,7,5,3,4,5,6,3,9,3,100};
		System.out.println(LastIndex(arr,arr.length-1,100));
	}
	
	public static int LastIndex(int arr[],int j,int target){
		if(j<0) {
			return -1;
		}
	    if(arr[j]==target){
	        return j;
	    }
	    return LastIndex(arr,j-1,target);
	}
}
