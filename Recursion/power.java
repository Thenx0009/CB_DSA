package Recursion;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 30;
		System.out.println(power(a,b));
	}
	public static int power(int a,int b) {
		if(b==0) {
			return 1;
		}
		int ans = power(a, b-1);
		return a*ans;
	}

}
