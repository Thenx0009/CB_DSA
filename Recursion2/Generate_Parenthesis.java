package Recursion2;

import java.util.ArrayList;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>ll = new ArrayList<>();
		int n = 3;
		Parenthesis(n,0,0,"",ll);
		System.out.println(ll);
	}
	public static void Parenthesis(int n,int opening,int closing,String ans,ArrayList<String>ll) {
		if(opening==n && closing==n) {
			ll.add(ans);
			
		}
		if(opening<n) {
			Parenthesis(n,opening+1,closing,ans+"(",ll);
		}
		if(closing<opening) {
			Parenthesis(n,opening,closing+1,ans+")",ll);
		}
	}
}
//OUTPUT
//[((())), (()()), (())(), ()(()), ()()()]