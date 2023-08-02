package lec_15_Strings;

import java.util.Scanner;

public class shortest_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(shortestPath(str));
	}
	public static float shortestPath(String str) {
		int x = 0;
		int y = 0;
		
		for(int i=0;i<str.length();i++) {
			char dir = str.charAt(i);
			if(dir =='N') {
				y++;
			}
			else if(dir == 'S') {
				y--;
			}
			else if(dir == 'W') {
				x--;
			}
			else {
				x++;
			}
		}
		int x2 = x*x;
		int y2 = y*y;
		return (float)Math.sqrt(x2+y2);
	}
}
