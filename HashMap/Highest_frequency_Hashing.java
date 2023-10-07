package HashMap;
import java.util.*;
public class Highest_frequency_Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//int max = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int val:arr) {
			if(map.containsKey(val)) {
				int count=0;
				count = map.get(val);
				map.put(val, count+1);
				
			}
			else {
				map.put(val, 1);
			}
			
		}
		System.out.println(maxNum(map,arr));
	}
	public static int maxNum(HashMap<Integer,Integer> map,int arr[]) {
		int maxFrequency = 0;
        int mostFrequentNumber = arr[0]; // Initialize with the first element

        for (int key : map.keySet()) {//it gives the key in the hashmap
            int frequency = map.get(key);//key--->value
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentNumber = key;
            }
        }
        return mostFrequentNumber;
	}

}
