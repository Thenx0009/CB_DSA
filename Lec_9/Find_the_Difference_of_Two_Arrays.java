package Lec_9;
import java.util.*;
public class Find_the_Difference_of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 2, 4, 6 };
		System.out.println(findDifference(arr1,arr2));
	}

	public static List<List<Integer>> findDifference(int[] arr1, int[] arr2) {
		List<Integer> ll1 = new ArrayList<>();
		List<Integer> ll2 = new ArrayList<>();
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(int i=0;i<arr1.length;i++) {
			set1.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			set2.add(arr2[i]);
		}
		
		for(int num:set1) {
			if(!set2.contains(num)) {
				ll1.add(num);
			}
		}
		for(int num:set2) {
			if(!set1.contains(num)) {
				ll2.add(num);
			}
		}
		List<List<Integer>> ans = new ArrayList<>();
		ans.add(ll1);
		ans.add(ll2);
		
		return ans;
	}
}
