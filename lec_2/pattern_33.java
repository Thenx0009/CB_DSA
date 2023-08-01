package lec_2;

import java.util.Scanner;

public class pattern_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = n-1;
		int st = 1;
		for(int i=1;i<n;i++) {
//			System.out.print(sp+","+st);
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				if(j==n/2) {
					System.out.print("0 ");
				}
				else {
					System.out.print("* ");
				}
				
			}
			sp--;
			st+=2;
			
			System.out.println();
		}

	}

}
