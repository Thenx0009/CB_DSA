//5
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
//5 4 3 2 1 
package lec_2;

import java.util.Scanner;

public class pattern_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int val = n;
			for(int j=1;j<=n;j++) {
				System.out.print(val+" ");
				val--;
			}
			System.out.println();
		}

	}

}
