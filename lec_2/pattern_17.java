//7
//* * *   * * * 
//* *       * * 
//*           * 
//              
//*           * 
//* *       * * 
//* * *   * * * 
package lec_2;

import java.util.Scanner;

public class pattern_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int st = n/2;
		int sp = 1;
		for(int i=1;i<=n;i++) {
//			System.out.print(st+","+sp);
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=st;k++) {
				System.out.print("* ");
			}
			if(i<=n/2) {
				st--;
				sp+=2;
			}
			else {
				st++;
				sp-=2;
			}
			
			System.out.println();
		}

	}

 }

