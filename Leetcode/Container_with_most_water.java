package Leetcode;

public class Container_with_most_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}

	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxarea = 0;

		while (left < right) {
			// area= l*w
			int area = Math.min(height[left], height[right]) * (right - left);
			maxarea = Math.max(area, maxarea);
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxarea;
	}

}
