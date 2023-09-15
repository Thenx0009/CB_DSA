package Recursion2;

public class Coin_Toss {
	
	static int count=0;//make the global varible to count the occurences
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		coin(n," ");
		System.out.println(count);
	}
	public static void coin(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			count++;
			return;
		}
		coin(n-1,ans+"H");
		coin(n-1,ans+"T");
	}
}
