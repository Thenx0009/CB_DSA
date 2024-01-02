package Leetcode;
import java.util.*;
public class Convert_an_Array_Into_a_2D_Array_With_Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,3,4,1,2,3,1};
		System.out.println(findMatrix(nums));
	}

	public static List<List<Integer>> findMatrix(int[] nums) {
		int freq[] = new int[nums.length + 1];
		ArrayList<List<Integer>> ans = new ArrayList<>();
		for (int e : nums) {
			if (freq[e] >= ans.size()) {
				ans.add(new ArrayList<>());
			}
			ans.get(freq[e]).add(e);
			freq[e]++;
		}
		return ans;
	}

}
