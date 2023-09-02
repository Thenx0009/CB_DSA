package Stacks;

public class Queue {

	private int data[];
	private int front = 0;
	private int size = 0;

	public Queue() {
		this.data = new int[5];
	}

	public Queue(int cap) {
		this.data = new int[cap];
	}

	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (this.size == this.data.length) {
			return true;
		}
		return false;
	}
	
	//Enqueue function
	public void enqueue(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is full");
		}
//STEP 1    this.data[size] = item;
//Step 2	int idx = this.front+this.size;  //here the exception occurs suppose front=2 and size=3 & addition is 5 which is out of bound and index=0,1 is empty so,there is a wastage of memory.
		    int idx = (this.front+this.size)%data.length;//hence,THIS statement made the CIRCULAR QUEUE
		    this.data[idx] = item;
		    size++;
	}
	
	//Dequeue function
	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv = this.data[front];
//     	front++;
		front= (front+1)%data.length;
		size--;
		return rv;
	}

	public int size() {
		return this.size;
	}
	public int getFront() {
		return this.data[front];
	}

	public void Display() {
		for (int i = 0; i <size; i++) {
			int idx = (this.front+i)%data.length;
			System.out.print(this.data[idx] + " ");
		}
		System.out.println();
	}
}
