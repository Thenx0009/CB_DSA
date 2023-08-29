package Generic;
import java.util.*;

public class LinkedListGeneric_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.addLast("Ayush");
		ll.addLast("Anup");
		ll.addLast("Akash");
		ll.addLast("Arjun");
		ll.addLast("Aman");
		ll.Display();
		
		ArrayList list = new ArrayList();//Without angular<> brackets it will take any type of value string,char,int
		list.add("Ayush");
		list.add(10);
		list.add('c');
		list.add(2.00);
		System.out.println(list);
		
		
				
	}

}
