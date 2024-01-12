package Leetcode;
import java.util.*;
public class Determine_if_String_Halves_Are_Alike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "book";
		System.out.println(halvesAreAlike(s));
	}

	public static boolean halvesAreAlike(String s) {
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

		int length = s.length();
		int midPoint = length / 2;

		String firstHalf = s.substring(0, midPoint);
		String secondHalf = s.substring(midPoint);

		return countVowels(firstHalf, vowels) == countVowels(secondHalf, vowels);
	}

	private static int countVowels(String str, Set<Character> vowels) {
		int count = 0;
		for (char c : str.toCharArray()) {
			if (vowels.contains(c)) {
				count++;
			}
		}
		return count;
	}

}
