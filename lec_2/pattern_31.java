//5
//5 4 3 2 * 
//5 4 3 * 1 
//5 4 * 2 1 
//5 * 3 2 1 
//* 4 3 2 1 
package lec_2;

import java.util.Scanner;

public class pattern_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int val = n;
			for(int j=1;j<=n;j++) {
				if(i+j==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print(val+" ");
				}
				val--;
			}
			System.out.println();
		}

	}

}
