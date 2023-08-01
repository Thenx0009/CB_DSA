//5
//        1 
//      1 2 1 
//    1 2 3 2 1 
//  1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 

package lec_2;

import java.util.Scanner;

public class patter_27 {

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
				if(j<=st/2) {
					val++;
				}
				else {
					val--;
				}
			}
			
			sp--;
			st+=2;
			System.out.println();
		}

	}

}
