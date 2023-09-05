package Queue;

public class DynamicQueue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamic_Queue dq = new Dynamic_Queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Dequeue();
		dq.Dequeue();
		dq.Display();
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Enqueue(80);
		dq.Enqueue(90);
		dq.Display();
	}

}
