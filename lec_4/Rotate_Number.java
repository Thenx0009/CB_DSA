package lec_4;

import java.util.Scanner;

public class Rotate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int dn = n;
		int rem=0,quotient=0;
		int count =0;
		
		//logic to count the number of digits
		while(dn!=0) {
			count++;
			dn=dn/10;
		}
		//logic to handle negative cycle of k
		if(k<0) {
			k=k+count;
		}
		//logic to find the remainder and divisior ....here divisior = 10^k
		for(int i=1;i<=k;i++) {
			int divisior = (int)Math.pow(10, k);
			rem = n%divisior;
			quotient = n/divisior;
		}
		//logic to find the multipler i.e 160000+2735
		int multiplier = (int)(rem * Math.pow(10, count-k));
		int ans = multiplier + quotient;
		System.out.println(ans);
	}

}
