package Recursion;

public class print_increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		PI(n);
	}
	public static void PI(int n) {
		if(n==6) {
			return;
		}
		System.out.println(n);
		PI(n+1);
	}
}
