package lec_4;

import java.util.Scanner;

public class bin_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int bin = 101010;
	    int pos=0;
	    int dec=0;
	
	    while(bin>0){
	        int rem = bin%10;
	        dec=dec+(int)Math.pow(2,pos)*rem;
	        bin=bin/10;
	        pos++;
	        
	    }
	    System.out.println(dec);

	}

}
