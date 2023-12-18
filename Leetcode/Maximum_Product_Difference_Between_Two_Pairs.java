package Leetcode;

public class Maximum_Product_Difference_Between_Two_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int nums[] = { 5, 6, 2, 7, 4 };
		System.out.println(maxProductDifference(nums));
	}

	public static int maxProductDifference(int[] a) {
		int fmax = 0, smax = 0;
		int fmin = Integer.MAX_VALUE, smin = Integer.MIN_VALUE;
		for (int x : a) {
			if (x < fmin) {
				smin = fmin;
				fmin = x;
			} else if (x < smin) {
				smin = x;
			}
			if (x > fmax) {
				smax = fmax;
				fmax = x;
			} else if (x > smax)
				smax = x;
		}
		return ((fmax * smax) - (fmin * smin));
	}

}
