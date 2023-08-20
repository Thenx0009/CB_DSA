package LinkedList;

import LinkedList.Linked_List_Cycle.Node;

public class Cycle_Removal {

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}
	private Node head;
	private int size;
	private Node tail;

	// non-static functions of linkedlist
	public void addFirst(int item) {
		Node nn = new Node(item);
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}
	}

	public void addLast(int item) {
		if (this.size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			size++;
		}
	}

	public void CreateCycle() {
		this.tail.next = this.head;// circular ll
		this.tail.next = this.head.next;// cycle ll
	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}
	public void removeCycle() {
		
		Node meetup = hasCycle();
		if(meetup==null) {
			return;
		}
		Node start = head;
		while(start!=null) {
			
			Node temp = meetup;
			while(temp.next!=meetup) {
				if(temp.next==start) {
					temp.next=null;
				}
				temp = temp.next;
			}
			start = start.next;
		}
	}
	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String args[]) {
		Cycle_Removal cl = new Cycle_Removal();
		cl.addLast(1);
		cl.addLast(2);
		cl.addLast(3);
		cl.addLast(4);
		cl.addLast(5);
		cl.addLast(6);
		cl.addLast(7);
		cl.addLast(8);
		cl.CreateCycle();
	    //cl.Display();
	    cl.removeCycle();
	    cl.Display();
		//System.out.println(cl.hasCycle());
	}
	
}
