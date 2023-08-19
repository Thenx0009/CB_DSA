package LinkedList;

import LinkedList.LinkedList.Node;
import LinkedList.Middle_of_a_LinkedList.ListNode;

public class Linked_List_Cycle {
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;// it is created outside the node class beacuse head is a part of linkedlist
	private int size;// it is created outside the node class beacuse size is a part of linkedlist
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
		this.tail.next = this.head.next;//cycle ll
	}

	public boolean hasCycle() {
		Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null) {
        	fast = fast.next.next;
        	slow = slow.next;
        	if(slow == fast) {
        		return true;
        	}
        }
        return false;
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
		Linked_List_Cycle cl = new Linked_List_Cycle();
		cl.addLast(1);
		cl.addLast(2);
		cl.addLast(3);
		cl.addLast(4);
		cl.addLast(5);
		cl.addLast(6);
		cl.addLast(7);
		cl.addLast(8);

		cl.Display();
		cl.CreateCycle();
		// cl.Display();//goes in a infinite loop
		System.out.println(cl.hasCycle());
	}
}
