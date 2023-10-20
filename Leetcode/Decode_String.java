package Leetcode;

import java.util.*;

public class Decode_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "3[a]2[bc]";
		System.out.println(decodeString(s));
	}

	public static String decodeString(String s) {
		Stack<Integer> is = new Stack<>();
		Stack<StringBuilder> ss = new Stack<>();

		int n = s.length(), num = 0;
		StringBuilder str = new StringBuilder();

		for (char ch : s.toCharArray()) {
			// There will be 4 types of characters --> number, [ , ], character

			if (ch >= '0' && ch <= '9') {
				num = (num * 10) + ch - '0';
			} 
			else if (ch == '[') {
				ss.push(str);
				str = new StringBuilder();

				is.push(num);
				num = 0;
			} 
			else if (ch == ']') {
				StringBuilder temp = str;
				str = ss.pop();
				int count = is.pop();

				while (count-- > 0) {
					str.append(temp);
				}
			} 
			else {
				str.append(ch);
			}
		}
		return str.toString();
	}
}
