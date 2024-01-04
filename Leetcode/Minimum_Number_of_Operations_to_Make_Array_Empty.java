package Leetcode;
import java.util.*;
public class Minimum_Number_of_Operations_to_Make_Array_Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,3,3,2,2,4,2,3,4};
		System.out.println(minOperations(nums));
		
	}

	public static int minOperations(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int operations = 0;
		for(int ele:nums) {
			if(map.containsKey(ele)) {
				int count = 0;
				count = map.get(ele);
				map.put(ele, count+1);
			}
			else {
				map.put(ele, 1);
			}
		}
		for (int key : map.keySet()) {
            int count = map.get(key);
            if (count == 1) {
                return -1;
            }
            operations+=Math.ceil((double)count/3);
        }
		return operations;
	}

}
