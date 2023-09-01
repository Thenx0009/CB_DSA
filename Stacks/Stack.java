package Stacks;

public class Stack {

	private int data[];
	private int top = 0;

	public Stack() {
		this.data = new int[5];
	}

	public Stack(int cap) {
		this.data = new int[cap];
	}

	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top == this.data.length) {
			return true;
		}
		return false;
	}

	public void push(int item) {
		this.data[top] = item;
		top++;
	}

	public int pop() {// here we overwrite the value
		top--;
		return this.data[top];
	}

	public int peek() {
		return this.data[top - 1];
	}
	
	public int size() {
		return top;
	}
	
	public void Display() {
		for(int i=0;i<top;i++) {
			System.out.print(this.data[i]+" ");
		}
		System.out.println();
	}
}
