//5
//        1
//      2 0 2
//    3 0 0 0 3
//  4 0 0 0 0 0 4   
//5 0 0 0 0 0 0 0 5     
package lec_2;

import java.util.Scanner;

public class pattern_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp =n-1;
		int st = 1;
		int val =1;
//		int val =1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				if(j==1 || j==st) {
					System.out.print(val+" ");
				}
				else {
					System.out.print("0 ");
				}
			}
			val++;
			sp--;
			st+=2;
			System.out.println();
		}


	}

}
