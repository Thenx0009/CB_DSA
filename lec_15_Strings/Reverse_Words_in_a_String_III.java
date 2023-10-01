package lec_15_Strings;

public class Reverse_Words_in_a_String_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String str) {
		String words[] = str.split(" ");// ["Let's", "take", "LeetCode", "contest"]
		StringBuilder sb = new StringBuilder();
		
		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word);
			sb.append(reversedWord.reverse()).append(" ");
		}
		 return sb.toString().trim();
	}

}
