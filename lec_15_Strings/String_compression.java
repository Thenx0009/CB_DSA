package lec_15_Strings;

import java.util.Scanner;

public class String_compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		compress(str);
	}
	public static void compress(String str) {
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0;i<str.length();i++) {
			Integer count =1;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			sb.append(str.charAt(i));
			if(count>1) {
				sb.append(count.toString());
			}
		}
		System.out.print(sb);
	}
}
