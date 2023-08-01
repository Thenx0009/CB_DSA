//5
//        1 
//      1 2 3 
//    1 2 3 4 5 
//  1 2 3 4 5 6 7 
//1 2 3 4 5 6 7 8 9 
package lec_2;

import java.util.Scanner;

public class pattern_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp =n-1;
		int st = 1;
//		int val =1;
		for(int i=1;i<=n;i++) {
			int val =1;
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print(val+" ");
				val++;
			}
			
			sp--;
			st+=2;
			System.out.println();
		}

	}

}
