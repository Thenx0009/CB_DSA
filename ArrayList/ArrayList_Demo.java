package ArrayList;

import java.util.*;
public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> ll = new ArrayList<Integer>();
		System.out.println(ll);
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);//adding element one after the other
		ll.add(3,100);//adding element at specific index
		System.out.println(ll);
		
		//size() method gives the size of the arraylist
		System.out.println(ll.size());
		
		//remove(index) method removes the element at particular index
		
		System.out.println(ll.remove(3));
		System.out.println(ll);
		
		//get(index) method is used to get the value at particular index
		System.out.println(ll.get(5));
		
		//set method is used to update the value
		ll.set(0, 100);
		System.out.println(ll);
		
		//to print the arraylist
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		
		
		//for Each loop
		for(int val:ll) {
			System.out.print(val+" ");
		}
	}
	

}
