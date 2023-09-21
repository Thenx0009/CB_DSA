package Recursion2;
import java.util.*;
public class Letter_Combinations_of_a_PhoneNumber {
	
	static String key[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll = new ArrayList<>();
		String str = "23";
		if(!str.isEmpty()) {//To handle the Empty String Test case
			keypad(str,"",ll);
		}
		System.out.println(ll);
	}
	public static void keypad(String ques,String ans,List<String>ll) {
		
		if(ques.length()==0) {
			ll.add(ans);
			return;
		}
/*		ASCII values
        0-->48
		1-->49
		2-->50
		3-->51
		4-->52
		5-->53
		6-->54
		7-->55
		8-->56
		9-->57   */
		char ch = ques.charAt(0);//'2'(char)
		String pressString = key[ch-48]; //50-48=2(int)
		
		for(int i=0;i<pressString.length();i++) {
			keypad(ques.substring(1),ans+pressString.charAt(i),ll);
		}
	}
}
