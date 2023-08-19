package LinkedList;

public class LinkedList_Client {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addFirst(50);
		ll.addLast(60);
		ll.Display();
		//System.out.println(ll.getFirst());
		//System.out.println(ll.getLast());

		System.out.println(ll.removeatIndex(2));
		ll.Display();
		ll.addatindex(100, 3);
		ll.Display();
	}

}
