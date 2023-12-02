package Leetcode;

public class Check_If_Two_String_Arrays_are_Equivalent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1[] = {"ab", "c"}, word2[] = {"a", "bc"};
		System.out.println(arrayStringsAreEqual(word1,word2));
	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();

		for (String word : word1) {
			str1.append(word);
		}
		for (String word : word2) {
			str2.append(word);
		}
		
		String s1 = str1.toString();
		String s2 = str2.toString();
		if (s1.equals(s2)) {
			return true;
		}
		return false;

	}

}
