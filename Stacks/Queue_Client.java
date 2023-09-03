package Stacks;

public class Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.Display();
		System.out.println("---> "+q.dequeue());
		System.out.println("---> "+q.dequeue());
		q.Display(); 
		System.out.println("size is "+q.size());
	}

}
