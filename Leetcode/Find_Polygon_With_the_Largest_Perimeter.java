package Leetcode;
import java.util.*;
public class Find_Polygon_With_the_Largest_Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,12,1,2,5,50,3};
		System.out.println(largestPerimeter(nums));
	}

	public static long largestPerimeter(int[] nums) {
		Arrays.sort(nums);
		long sum = 0;
		long ans = -1;
		// [1,1,2,3,5,12,50]
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < sum) {
				ans = nums[i] + sum;
			}
			sum += nums[i];
		}

		return ans;
	}

}
