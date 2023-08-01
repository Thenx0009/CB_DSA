//7
//      * 
//    *   * 
//  *       * 
//*           * 
//  *       * 
//    *   * 
//      * 
package lec_2;

import java.util.Scanner;

public class pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = n/2;
		int st = 1;
		int is = -1;
		for(int i=1;i<=n;i++) {
			//System.out.print(sp+","+st);
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=is;j++) {
				System.out.print("  ");
			}
			int k=1;
			if(i==1 || i==n) {
				k=2;
			}
			for(;k<=st;k++) {
				System.out.print("* ");
			}
			if(i<(n/2)+1) {
				sp--;
				is+=2;
			}
			else {
				sp++;
				is-=2;
			}
			System.out.println();
		}
	}

}
