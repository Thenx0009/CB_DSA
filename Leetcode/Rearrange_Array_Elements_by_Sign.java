package Leetcode;

import java.util.*;

public class Rearrange_Array_Elements_by_Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 3, 1, -2, -5, 2, -4 };
		int result[] = rearrangeArray(nums);
		for(int val:result) {
			System.out.print(val+" ");
		}
		
	}

	public static int[] rearrangeArray(int[] nums) {
		int[] ans = new int[nums.length];
		int pos = 0;
		int neg = 1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				ans[pos] = nums[i];
				pos += 2;
			} 
			else {
				ans[neg] = nums[i];
				neg += 2;
			}
		}
		return ans;
	}

}
