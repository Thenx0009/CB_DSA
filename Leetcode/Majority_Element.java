package Leetcode;
import java.util.*;
public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
    public static int majorityElement(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int val:arr) {
			if(map.containsKey(val)) {
				int count = map.get(val);
				map.put(val, count+1);
			}
			else {
				map.put(val, 1);
			}
		}
		for(int key:map.keySet()) {
			int frequency = map.get(key);
			if(frequency>(arr.length/2)) {
				return key;
			}
		}
		return -1;
    }

}
