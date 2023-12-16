package Leetcode;

import java.util.Arrays;

public class Valid_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rat";
		String t = "car";
		System.out.println(isAnagram(s,t));
	}

	public static boolean isAnagram(String s, String t) {
		char s1[] = s.toCharArray();
		char s2[] = t.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		return Arrays.equals(s1, s2);
	}

}
