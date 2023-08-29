package Generic;


public class LinkedList<T> {
	
	public class Node{
		T data;
		Node next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node head;//it is created outside the node class beacuse head is a part of linkedlist
	private int size;//it is created outside the node class beacuse size is a part of linkedlist
	private Node tail;
	
	//non-static functions of linkedlist
	public void addFirst(T item) {
		Node nn = new Node(item);
		if(this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
		else {
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}
	}
	public void addLast(T item) {
		if(this.size == 0) {
			addFirst(item);
		}
		else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			size++;
		}
	}
	public void addatindex(T item,int k) throws Exception {
		if(k<0 ||k>size) {
			throw new Exception("index out of Bound");
		}
		if(k==0) {
			addFirst(item);
		}
		else if(k==size) {
			addLast(item);
		}
		else {
			Node nn = new Node(item);
			Node k_1th = getNode(k-1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			this.size++;
		}
	}
	
	public T getFirst()throws Exception {
		if(size==0) {
			throw new Exception("LinkedList is empty");
		}
		return this.head.data;
	}
	
	public T getLast()throws Exception {
		if(size==0) {
			throw new Exception("LinkedList is empty");
		}
		return this.tail.data;
	}
	
	public T getatIndex(int k)throws Exception {
		return getNode(k).data;
	}
	
	private Node getNode(int k)throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("index out of Bound");
		}
		Node temp = head;
		for(int i=0;i<k;i++) {
			temp = temp.next;
		}
		return temp;
	} 
	public T removeFirst() {
		Node temp = this.head;
		this.head = this.head.next;
		temp.next = null;
		this.size--;
		return temp.data;
	}
	public T removeLast()throws Exception {
		if(this.size==1) {
			removeFirst();
		}
		Node temp = getNode(this.size-2);
		T rv = tail.data;
		this.tail = temp;
		this.tail.next = null;
		this.size--;
		return rv;
	}
	public T removeatIndex(int k)throws Exception {
		if(k<=0 || k>=size) {
			throw new Exception("index out of Bound");
		}
		if(k==0) {
			return removeFirst();
		}
		else if(k==this.size-1) {
			return removeLast();
		}
		else {
			Node kth = getNode(k);
			Node k_1th = getNode(k-1);
			k_1th.next = kth.next;
			kth.next = null;
			this.size--;
			return kth.data;
		}
	}
	public void Display() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println();
	}
}