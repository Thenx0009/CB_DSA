package lec_4;

import java.util.Scanner;

public class prime_factorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=2;
		while(n!=1) {
			int rem = n%i;
			if(rem==0) {
				int q = n/i;
				System.out.println(i);
				n = q;
			}
			else {
				i++;
			}
		}
	}

}
