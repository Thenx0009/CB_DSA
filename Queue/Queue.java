package Queue;

public class Queue {

	protected int data[];
	protected int front = 0;
	private int size = 0;

	public Queue() {
		data = new int[5];
	}

	public Queue(int n) {
		data = new int[n];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return this.size == this.data.length;
	}

	public void Enqueue(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is full");
		}
		int idx = (front + size) % data.length;
		data[idx] = item;
		size++;
	}

	public int Dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv = data[front];
		front = (front + 1) % data.length;
		size--;
		return rv;
	}

	public int Getfront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv = data[front];
		return rv;
	}

	public int size() {
		return size;
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % data.length;
			System.out.print(data[idx] + " ");
		}
		System.out.println();
	}
}
