package lec_4;

import java.util.Scanner;

public class reverse_of_a_number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n!=0) {
			int dig = n%10;
			n = n/10;
			System.out.println(dig);
		}

	}

}
