package LinkedList;
import java.util.LinkedList;
public class Stack_using_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		System.out.println(list);
		list.remove();
		list.remove();
		System.out.println(list);
	}

}
