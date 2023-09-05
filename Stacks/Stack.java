package Stacks;

public class Stack {

	//private int data[];
	private int top = 0;
	protected int data[];

	public Stack() {
		this.data = new int[5];// Non-parameterised Constructor
	}

	public Stack(int cap) {
		this.data = new int[cap];// parameterised Constructor
	}
	
	//isFull function 
	public boolean isFull() {
		if (this.top == this.data.length) {
			return true;
		}
		return false;
	}

	//isEmpty function
	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		return false;
	}
	
	//push function
	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Stack is Full");
		}
		this.data[top] = item;
		top++;
	}
	
	//pop function
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		top--;
		return this.data[top];
	}
	
	//peek function
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return this.data[top - 1];
	}
	
	//size function
	public int size() {
		return top;
	}
	
	//display function
	public void Display() {
		for (int i = 0; i < top; i++) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println();
	}
}
