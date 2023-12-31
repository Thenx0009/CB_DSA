package Leetcode;

public class Largest_Substring_Between_Two_Equal_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aa";
		System.out.println(maxLengthBetweenEqualCharacters(s));
	}

	public static int maxLengthBetweenEqualCharacters(String s) {
		int ans = -1;
		for (int left = 0; left < s.length(); left++) {
			for (int right = left + 1; right < s.length(); right++) {
				if (s.charAt(left) == s.charAt(right)) {
					ans = Math.max(ans, right - left - 1);
				}
			}
		}
		return ans;
	}

}
