package lec_4;

import java.util.Scanner;

public class pythagorean_triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//4 3 5
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max=a;
		if(b>=max) {
			max=b;
		}
		if(c >= max) {
			max=c;
		}
		if(max==a) {
			boolean flag = ((b*b)+(c*c)==(a*a));
			System.out.print(flag);
		}
		else if(max==b) {
			boolean flag = ((a*a)+(c*c)==(b*b));
			System.out.print(flag);
		}
		else {
			boolean flag = ((b*b)+(a*a)==(c*c));
			System.out.print(flag);
		}
		
	}

}
