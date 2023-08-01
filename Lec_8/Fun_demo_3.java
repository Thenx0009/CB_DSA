package Lec_8;

import java.util.Scanner;

public class Fun_demo_3 {
	////parameterized and having return type
   static int val=100;//static is used to make the variable global and store in Heap memory
	
	public static int addition(int a,int b) {
		int c=a+b;	
		val=val+5;
		return c;
	}
	public static int sub(int a,int b) {
		int c=a-b;	
		val=val-10;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		System.out.println(val);
		System.out.println(addition(a,b));
		System.out.println(val);
		System.out.println(sub(a,b));
		System.out.println(val);
		
	}

}
