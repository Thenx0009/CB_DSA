package Collection;

import java.util.*;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addFirst(50);
		for(int val:ll) {
			System.out.print(val+" ");
		}
		//get
		System.out.println();
		System.out.println(ll.get(2));
		System.out.println("***************");
		//print the values using the iterator
		
		Iterator<Integer> iterator =  ll.iterator();
		
		while(iterator.hasNext()) {
			int val = iterator.next();
			System.out.println(val);
		}
	}

}
