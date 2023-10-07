/**
 
BUSYMAN - I AM VERY BUSY
#greedy
I AM VERY BUSY
You are actually very busy man. You have a big schedule of activities. Your aim is to do as much as activities as possible.



In the given figure, if you go to date with crush, you cannot participate in the coding contest and you can’t watch the movie. Also if you play DotA, you can’t study for the exam. If you study for the exam you can’t sleep peacefully. The maximum number of activities that you can do for this schedule is 3. 

Either you can

watch movie, play DotA and sleep peacefully (or)
date with crush, play DotA and sleep peacefully
Input Specifications
The first line consists of an integer T, the number of test cases. For each test case the first line consists of an integer N, the number of activities. Then the next N lines contains two integers m and n, the start and end time of each activity.

Output Specifications
For each test case find the maximum number of activities that you can do.

Input Constraints
1 <= T <=10
1 <= N <= 100000
0 <= start < end <= 1000000

Example
Sample Input: (empty lines just for clarity)
3
3
3 9
2 8
6 9

4
1 7
5 8
7 8
1 8

6
7 9
0 10
4 5
8 9
4 10
5 7

Sample Output:
1
2
3
  **/
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
