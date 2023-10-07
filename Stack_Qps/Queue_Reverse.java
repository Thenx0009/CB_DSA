package Stack_Qps;
import Stacks.Queue;
public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.Display();
		System.out.println("***************");
		reverse(q);
		q.Display();
	}
	public static void reverse(Queue q) throws Exception {
		if(q.isEmpty()) {
			return;
		}
		int x = q.dequeue();
		reverse(q);
		q.enqueue(x);	
	}
}
