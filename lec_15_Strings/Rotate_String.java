package lec_15_Strings;

import java.util.Arrays;

public class Rotate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		String goal = "cdeab";
		System.out.println(rotateString(s,goal));
	}

	public static boolean rotateString(String s, String goal) {
		char str[] = s.toCharArray();
		char tar[] = goal.toCharArray();
		
		for(int i=0;i<str.length;i++) {
			char temp = str[0];
			for(int j=1;j<str.length;j++) {
				str[j-1] = str[j];
			}
			str[str.length-1] = temp;
			if(Arrays.equals(str, tar)) {
				return true;
			}
		}
		return false;
	}

}
