package Stack_Qps;

import java.util.*;

public class valid_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = "()[]{}";
		System.out.println(isValid(str));
	}

	public static boolean isValid(String str) {
		Stack<Character> st = new Stack();
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			} 
			else {
				if (st.isEmpty()) {
					return false;
				}
				char top = st.peek();
				if ((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{')) {
					st.pop();
				} else {
					return false;
				}
			}
		}
		return st.isEmpty();
	}
}
