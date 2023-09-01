package Stacks;

public class Stack_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		//st.push(60);
		st.Display();
		//st.pop();
		st.Display();
		System.out.println( st.peek());
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
	}
	

}
