package Stack_Qps;

import java.util.Stack;
public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
//		Ist Approach(using another stack)
		
//		Stack<Integer> st1 = new Stack<>();
//		while(!st.isEmpty()) {
//			int element = st.pop();
//			st1.push(element);
//		}
//		System.out.println(st1);
		
		Reverse(st);
		System.out.println(st);
		
	}	
//      IInd Approach (using Recursion)
	public static void Reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int x = st.pop();
		Reverse(st);
		//st.push(x);
		Insert_Down(st,x);
	}
	private static void Insert_Down(Stack<Integer> st,int x) {
		if(st.isEmpty()) {
			st.push(x);
			return;
		}
		int y=st.pop();
		Insert_Down(st,x);
		st.push(y);
	}
}
