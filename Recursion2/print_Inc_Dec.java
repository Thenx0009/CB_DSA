package Recursion2;

public class print_Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		IncDec(n);
	}

	public static void IncDec(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		IncDec(n-1);
		System.out.println(n);
	}
	
}
