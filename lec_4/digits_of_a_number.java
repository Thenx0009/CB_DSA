package lec_4;

import java.util.Scanner;

public class digits_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//logic to count the number of digits
		int nod = 0;
		int temp = n;
		while(temp != 0) {
			temp=temp/10;
			nod++;
		}
		//logic to make the divior of 10^number of digits2-1
		int div = (int)Math.pow(10,nod-1);
		
		//logic to print number in next line
		while(div != 0) {
			int q = n/div;
			System.out.print(q);
			
			n = n%div;
			div = div/10;
		}
	}

}
