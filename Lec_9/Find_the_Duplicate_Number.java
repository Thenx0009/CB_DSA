package Lec_9;
import java.util.*;
public class Find_the_Duplicate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 3,3,3,3,3 };
		System.out.println(findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		for(int num:nums) {
			if(map.containsKey(num)) {
				int count = map.get(num);
				map.put(num, count+1);
			}
			else {
				map.put(num, 1);
			}
		}
		for(int key:map.keySet()) {
			int freq = map.get(key);
			if(freq>1) {
				return key;
			}
		}
		return -1;
	}

}
