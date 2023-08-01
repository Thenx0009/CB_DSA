//5
//*               * 
//* *           * * 
//* * *       * * * 
//* * * *   * * * * 
//* * * * * * * * *
package lec_2;

import java.util.Scanner;

public class pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int st =1;
		int sp =(2*n)-3;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			int k=1;
			if(i==n) {
				k=2;
			}
			for(;k<=st;k++) {
				System.out.print("* ");
			}
			st++;
			sp-=2;
			System.out.println();
		}

	}

}
