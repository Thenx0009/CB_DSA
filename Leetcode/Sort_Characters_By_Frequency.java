package Leetcode;

import java.util.*;

public class Sort_Characters_By_Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "tree";
		frequencySort(s);
	}

	public static void frequencySort(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				int count = 0;
				count = map.get(ch);
				map.put(ch, count + 1);
			} else {
				map.put(ch, 1);
			}
		}
		ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
		/**
		 * map.entrySet(): This method returns a set view of the mappings contained in
		 * the map. Each element in the set is a Map.Entry object representing a
		 * key-value pair in the map.
		 * 
		 * new ArrayList<>(map.entrySet()): This creates a new ArrayList and initializes
		 * it with the elements from the set of map entries. The result is a list of
		 * key-value pairs from the original map.
		 */
		// Sort the list based on the frequency in descending order
		list.sort((a, b) -> b.getValue() - a.getValue());
		System.out.println(list);
		StringBuilder sb = new StringBuilder();

		for (Map.Entry<Character, Integer> entry : list) {
			char ch = entry.getKey();
			int count = entry.getValue();
			for (int i = 1; i <= count; i++) {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}
}
