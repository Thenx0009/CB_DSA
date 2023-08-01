package Stacks;

import java.util.Scanner;
import java.util.Stack;
public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		stockSpan(arr);
	}
	public static void stockSpan(int arr[]) {
		int []ans=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty()&&arr[i]>=arr[st.peek()]) {
				st.pop();
			}
		
		if(st.isEmpty()) {
			ans[i]=i+1;
		}
		else {
			ans[i]=i-st.peek();
		}
		st.push(i);
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
