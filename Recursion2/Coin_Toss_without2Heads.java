package Recursion2;

public class Coin_Toss_without2Heads {

	static int count=0;
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
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {//This condition doesn't print 2 consecutive HEADS
			coin(n-1,ans+"H");
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='T') {//This condition doesn't print 2 consecutive TAILS
			coin(n-1,ans+"T");
		}
		//coin(n-1,ans+"T");
	}
}
