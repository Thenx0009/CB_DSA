package lec_4;

import java.util.Scanner;

public class dec_to_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dec = 105;
		int pos=0;
		int bin=0;
		while(dec>0) {
			int q=dec/2;
			int rem = dec%2;
			bin = bin+rem*(int)Math.pow(10, pos);
			dec=q;
			pos++;
		}
		System.out.print(bin);
	}

}
