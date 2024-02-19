package lec_15_Strings;

import java.util.*;

public class First_Unique_Character_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));
	}

	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> map = new HashMap<>();

		for(char ch : s.toCharArray()) {
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count+1);
			}
			else {
				map.put(ch, 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1) {
				return i;
			}
		}

		return -1;
	}

}
