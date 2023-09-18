package Recursion2;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		//System.out.println("\n"+BoardPath1(n,0,""));
		System.out.println("\n"+BoardPath2(n,0,""));
	}
	//Method 1
	public static int BoardPath1(int end,int curr,String ans) {
		if(curr == end) {
			System.out.print(ans+" ");
			return 1;
		}
		if(curr > end) {
			return 0;
		}
		int fp=BoardPath1(end,curr+1,ans+1);
		int sp=BoardPath1(end,curr+2,ans+2);
		int tp=BoardPath1(end,curr+3,ans+3);
		return fp+sp+tp;
	}
	//Method 2 
	//When there are more than 3 recursive calls then we write Recursive calls in the Loop
	//Above function is written using loop
	public static int BoardPath2(int end,int curr,String ans) {
		if(curr == end) {
			System.out.print(ans+" ");
			return 1;
		}
		if(curr > end) {
			return 0;
		}
		int count=0;
		for(int dice=1;dice<=3;dice++) {
			 count = count + BoardPath2(end,curr+dice,ans+dice);
		}
		return count;
	}
	
}
