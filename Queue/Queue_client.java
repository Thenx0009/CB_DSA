package Queue;

public class Queue_client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Queue qe = new Queue();
		qe.Enqueue(10);
		qe.Enqueue(20);
		qe.Enqueue(30);
		qe.Enqueue(40);
		qe.Display();
	}

}
