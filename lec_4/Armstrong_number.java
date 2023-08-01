package lec_4;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =n;
	        int x = n;
	        int nod =0;
	        int rem =0;
	        int sum =0;
	        //logic to calculate number of digits
	        while(n!=0){
	            n=n/10;
	            nod++;
	        }
	        //logic for armstrong number
	        while(x!=0){
	            rem = x%10;
	            sum = sum + (int)(Math.pow(rem,nod));
	            x=x/10;
	        }
	        if(sum==temp){
	            System.out.print("true");
	        }
	        else{
	            System.out.print("false");
	        }

	}

}
