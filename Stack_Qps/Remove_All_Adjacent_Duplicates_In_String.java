package Stack_Qps;
import java.util.*;
public class Remove_All_Adjacent_Duplicates_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbaca";
		System.out.println(remove(str));
	}

	public static String remove(String str) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(st.size()>0&&st.peek()==ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
		}
		StringBuilder sb = new StringBuilder("");
		for(char x:st) {
			sb.append(x);
		}
		return sb.toString();
	}
	

}
