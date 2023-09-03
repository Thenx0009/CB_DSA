package Stacks;

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Stack st = new Stack();
		//st.pop();//here STACK EMPTY exception generated
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println("-->"+st.pop());
		st.push(60);
		st.Display();
		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println("**************");
		//st.push(100);//Here STACK FULL exception generated
		//st.push(200);//Here STACK FULL exception generated
	}
}
