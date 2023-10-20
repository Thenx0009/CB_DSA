package LinkedList;
import java.util.LinkedList;

public class Queue_using_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.addLast(50);
		System.out.println(list);
	}

}
