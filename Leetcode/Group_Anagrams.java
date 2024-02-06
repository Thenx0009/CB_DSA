package Leetcode;

import java.util.*;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[] = { "eat","tea","tan","ate","nat","bat" };
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		if(strs.length==0 || strs==null) {
			return new ArrayList<>();
		}
		HashMap<String,List<String>> map = new HashMap<>();
		
		for(int i=0;i<strs.length;i++) {
			char currstr[] = strs[i].toCharArray();
			Arrays.sort(currstr);
			currstr.toString();
			String sortedStr = new String(currstr);
			
			if(map.containsKey(sortedStr)) {
				map.get(sortedStr).add(strs[i]);
			}
			else {
				List<String> newlist = new ArrayList<>();
				newlist.add(strs[i]);
				map.put(sortedStr, newlist);
			}
		}
		List<List<String>> ans  = new ArrayList<>(map.values());
		
		return ans;
	}
}
