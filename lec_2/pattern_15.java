//5
//* * * * * 
//    * * * * 
//        * * * 
//            * * 
//                * 
//            * * 
//        * * * 
//    * * * * 
//* * * * * 
package lec_2;

import java.util.Scanner;

public class pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = 0;
		int st = n;
		for(int i=1;i<=(2*n)-1;i++) {
//			System.out.print(sp+","+st);
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			}
			if(i<n) {
				sp+=2;
				st--;
			}
			else {
				sp-=2;
				st++;
			}
			System.out.println();
		}

	}

}
