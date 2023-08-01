//5
//1                 
//2 * 2             
//3 * 3 * 3         
//4 * 4 * 4 * 4     
//5 * 5 * 5 * 5 * 5 
//4 * 4 * 4 * 4     
//3 * 3 * 3         
//2 * 2             
//1      
package lec_2;

import java.util.Scanner;

public class pattern_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int st = 1;
		int sp = (2*n)-2;
		int val=1;
		for(int i=1;i<=(2*n)-1;i++) {
//			System.out.print(st+","+sp);
			for(int j=1;j<=st;j++) {
				if(j%2!=0) {
					System.out.print(val+" ");
				}
				else {
					System.out.print("* ");
				}
				
			}
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			if(i<n) {
				val++;
			}
			else {
				val--;
			}
			if(i<n) {
				st+=2;
				sp-=2;
			}
			else {
				st-=2;
				sp+=2;
			}
			System.out.println();
		}

	}

}
