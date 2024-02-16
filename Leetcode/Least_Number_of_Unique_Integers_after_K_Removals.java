package Leetcode;
import java.util.*;
public class Least_Number_of_Unique_Integers_after_K_Removals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,1,1,3,3,2};
		int k = 3;
		System.out.println(findLeastNumOfUniqueInts(arr,k));
	}

	public static int findLeastNumOfUniqueInts(int[] arr, int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int val:arr) {
			if(map.containsKey(val)) {
				int count = 0;
				count = map.get(val)+1;
				map.put(val, count);
			}
			else {
				map.put(val, 1);
			}
		}
		ArrayList<Map.Entry<Integer, Integer>> sortElements = new ArrayList<>(map.entrySet());
		sortElements.sort((a,b)->a.getValue()-b.getValue());
		
		for (Map.Entry<Integer, Integer> entry : sortElements) {
            if (entry.getValue() <= k) {
                k = k - entry.getValue();
                map.remove(entry.getKey());
            } else {
                break;
            }
        }
		return map.size();
	}

}
