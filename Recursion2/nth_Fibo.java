package Recursion2;

public class nth_Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		System.out.println(Fibo(n));
	}
	
	public static int Fibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int f1 = Fibo(n-1);
		int f2 = Fibo(n-2);
		
		return f1+f2;
	}

}
