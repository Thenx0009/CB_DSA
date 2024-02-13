package Leetcode;

public class Find_First_Palindromic_String_in_the_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  words[] = {"abc","car","ada","racecar","cool"};
		System.out.println(firstPalindrome(words));
	}

	public static String firstPalindrome(String[] words) {
		for(String word:words) {
			boolean result = isPalindrome(word,0,word.length()-1);
			if (result) {
				return word;
			}
		}
		return "";
	}
	public static boolean isPalindrome(String word, int i,int j){
		while(i<j) {
			if(word.charAt(i)!=word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
