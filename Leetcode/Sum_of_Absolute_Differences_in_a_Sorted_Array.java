package Leetcode;

public class Sum_of_Absolute_Differences_in_a_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,6,8,10};
		int result[] = 	getSumAbsoluteDifferences(arr);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
	public static int[] getSumAbsoluteDifferences(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum = sum+n;
        }
        int left=0;
        int right=sum;

        int[] arr2 = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            right = right - n;
            arr2[i] = n*i - left + right - n*(nums.length-i - 1);
            left = left+n;
        }

        return arr2;
    }

}
