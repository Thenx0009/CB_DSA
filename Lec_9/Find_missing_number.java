package Lec_9;

public class Find_missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,38,39,40};
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<arr.length;i++){
			sum1 = sum1+arr[i];
		}
		
		for(int i=1;i<=40;i++) {
			sum2=sum2+i;
		}
		
		int missing_no = sum2-sum1;
		System.out.println(missing_no);
	}

}
