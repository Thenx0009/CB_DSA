package Leetcode;

public class Palindromic_Substrings {
	static int result = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaa";
		System.out.println(countSubstrings(s));
	}

	public static int countSubstrings(String s) {
		result = 0;// Reset result before each call
		for (int i = 0; i < s.length(); i++) {
			count(s,i,i);
			count(s,i,i+1);
		}
		return result;
	}
	public static void count(String s, int start, int end) {
		while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)) {
			result++;
			start--;
			end++;
		}
	}

}
