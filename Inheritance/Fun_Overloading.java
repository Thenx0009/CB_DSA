package Inheritance;

public class Fun_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(2,5));
		System.out.println(Add(2,5,4,5,6,7,5,5,3,3,5));
	}
	public static int Add(int a,int b) {
		return a+b;
	}
	public static int Add(int a,int b,int c) {
		return a+b+c;
	}
	public static int Add(int a,int b,int c,float d) {
		return (int)(a+b+c+d);
	}
	public static int Add(int a,int...b) {
		int sum = 0;
		for(int i=0;i<b.length;i++) {
			sum+=b[i];
		}
		return sum;
	}
}
