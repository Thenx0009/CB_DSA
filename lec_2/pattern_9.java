//5
//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 
package lec_2;

import java.util.Scanner;

public class pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = n-1;
		int st = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			}
			sp--;
			st+=2;
			System.out.println();
		}

	}

}
