package lec_15_Strings;

import java.util.*;

public class Count_Elements_With_Maximum_Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 2, 2, 3, 1, 4 };
		System.out.println(maxFrequencyElements(nums));
	}

	public static int maxFrequencyElements(int[] nums) {
		// Calculate frequencies of elements using a HashMap
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		int maxFrequency = 0;

		for (int num : nums) {
			int count = frequencyMap.getOrDefault(num, 0) + 1;
			frequencyMap.put(num, count);
			maxFrequency = Math.max(maxFrequency, count);
		}

		// Count elements with the maximum frequency
		int result = 0;
		for (int count : frequencyMap.values()) {
			if (count == maxFrequency) {
				result += count;
			}
		}

		return result;
	}

}
