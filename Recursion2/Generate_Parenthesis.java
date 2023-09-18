package Recursion2;

import java.util.*;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>ll = new ArrayList<>();
		int n = 3;
		Parenthesis(n,0,0,"",ll);
		System.out.println(ll);
	}
	public static void Parenthesis(int n,int opening,int closing,String ans,List<String>ll) {
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