package Leetcode;

import java.util.Iterator;

public class Longest_Increasing_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(lengthOfLIS(nums));
	}

//using memoiation
	public static int lengthOfLIS(int[] nums) {
		int dp[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					if (dp[j] + 1 > dp[i]) {
						dp[i] = dp[j] + 1;
					}
				}
			}
		}
		int maxindex = 0;
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] > dp[maxindex]) {
				maxindex = i;
			}
		}
		return dp[maxindex] + 1;
	}

}
