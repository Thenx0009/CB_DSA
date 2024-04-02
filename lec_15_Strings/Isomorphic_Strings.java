package lec_15_Strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "paper", t = "title";
		System.out.println(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char original = s.charAt(i);
			char replacement = t.charAt(i);

			if (!map.containsKey(original)) {
				if (map.containsValue(replacement)) {
					return false;
				}
				map.put(original, replacement);
			} 
			else {
				// If the mapping is different, it's not isomorphic
				if (map.get(original) != replacement) {
					return false;
				}
			}
		}
		return true;
	}

}
