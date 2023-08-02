package lec_15_Strings;

import java.util.Scanner;

public class shortest_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(shortestPath(str));
	}
	public static int shortestPath(String str) {
		int x1=0;
		int y1=0;
		int x2=0;
		int y2=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='N') {
				y2++;
			}
			else if(str.charAt(i)=='S') {
				y2--;
			}
			else if(str.charAt(i)=='E') {
				x2++;
			}
			else {
				x2--;
			}
		}
		int x = (int)Math.pow((x2-x1), 2);
		int y = (int)Math.pow((y2-y1), 2);
		int ans = (int)Math.sqrt(x+y);
		return ans;
	}
}
