package lec_2;

import java.util.Scanner;

public class pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int st=1;
		int sp=n-1;
		for(int i=1;i<=(2*n)-1;i++) {
			
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			}
			if(i<n) {
				st++;
				sp--;
			}
			else {
				st--;
				sp++;
			}
			System.out.println();
		}
		

	}

}
