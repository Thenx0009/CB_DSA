package lec_4;

import java.util.Scanner;

public class GCD_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		int originalNum1 = dividend;
		int originalNum2 = divisor;
		
		while(dividend % divisor!=0) {
			int rem= dividend%divisor;
			dividend = divisor;
			divisor =rem;
		}
		System.out.println("GCD of the numbers is: "+divisor);
		int gcd = divisor;
		int lcm = (originalNum1*originalNum2)/gcd;
		System.out.print("LCM of he number is: "+lcm);
	}

}
