package lec_15_Strings;

import java.util.Scanner;

public class letter_to_uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder("");
		char ch = Character.toUpperCase(str.charAt(0));
		sb.append(ch);
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)== ' ' && i<str.length()-1) {
				sb.append(str.charAt(i));
				i++;
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
			else {
				sb.append(str.charAt(i));
			}
		}
		System.out.print(sb);
	}

}
