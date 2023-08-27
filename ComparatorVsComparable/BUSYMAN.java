package ComparatorVsComparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BUSYMAN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pair arr[] = new Pair[n];
		for(int i=0;i<arr.length;i++) {
			int st = sc.nextInt();
			int et = sc.nextInt();
			arr[i] = new Pair(st,et);
		}
		Arrays.sort(arr, new Comparator<Pair>() {
			
			@Override
			public int compare(Pair o1,Pair o2) {
				return o1.et-o2.et;
			}
		});
		//This is the main login of the question
		int task = 1;
		int end = arr[0].et;
		for(int i=1;i<arr.length;i++) {
			if(end<=arr[i].st) {
				task++;
				end=arr[i].et;
			}
		}
		System.out.print(task);
	}
	static class Pair{//here it is an inner class so me make static class
		int st;
		int et;
		
		public Pair(int st,int et) {
			this.st = st;
			this.et = et;
		}
	}

}
