package Queue;

public class Queue {
	
	private int arr[];
	private int front=0;
	private int size=0;
	
	public Queue() {
		arr = new int[5];
	}
	public Queue(int n) {
		arr = new int[n];
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean isfull() {
		return arr[size] == arr.length;
	}
	public void Enqueue(int item)throws Exception {
		if(isfull()) {
			throw new Exception("Queue is full");
		}
		int idx = (front + size)%arr.length;
		arr[idx]=item;
		size++;
	}
	public int Dequeue()throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv = arr[front];
		front=(front+1)%arr.length;
		size--;
		return rv;
	}
	public int Getfront()throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv = arr[front];
		return rv;
	}
	public int size() {
		return size;
	}
	public void Display() {
		for(int i=0;i<size;i++) {
			int idx = (front+i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
}
