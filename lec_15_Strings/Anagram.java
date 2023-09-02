package lec_15_Strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "silent";
		String str2 = "listen";
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		Boolean result = Arrays.equals(ch1, ch2);
		if(result) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
