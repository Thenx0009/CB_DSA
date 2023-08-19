package Tree;

import java.util.*;

public class BinaryTree {
	
	Scanner sc = new Scanner(System.in);
	
	public class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	
	public BinaryTree() {
		this.root = CreateTree();
	}
	private Node CreateTree() {
		int item =  sc.nextInt(); 
		Node nm = new Node();
		nm.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			nm.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			nm.right = CreateTree();
		}
		return nm;
	}
	public void levelorder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node rv = q.remove();
			System.out.print(rv.data+" ");
			if(rv.left != null) {
				q.add(rv.left);
			}
			if(rv.right != null) {
				q.add(rv.right);
			}
		}
		System.out.println();
	}
	public void Display() {
		Display(root);
	}
	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "";
		s = "<-" + nn.data + "->";
		if (nn.left != null) {
			s = nn.left.data + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.data;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}
	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}

		int left = max(nn.left);
		int right = max(nn.right);
		return Math.max(nn.data, Math.max(left, right));

	}
	public boolean find(int item) {

		return find(this.root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}

		if (nn.data == item) {
			return true;
		}
		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;

	}
	public int ht() {

		return ht(this.root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}
	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}
	private void POStOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		POStOrder(node.left);
		POStOrder(node.right);
		System.out.print(node.data + " ");

	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}
	private void INOrder(Node node) {
		if (node == null) {
			return;
		}
		INOrder(node.left);
		System.out.print(node.data + " ");
		INOrder(node.right);
	}
}
