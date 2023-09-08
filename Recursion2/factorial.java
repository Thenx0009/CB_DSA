package Recursion2;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));
	}

	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		int fn = fact(n-1);
		return fn*n;
	}
}
