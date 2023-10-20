package Tree;

import java.util.Scanner;

public class Binary_Tree {

	Scanner sc = new Scanner(System.in);// for taking data as an input

	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public Binary_Tree() {
		this.root = Createtree();
	}

	private Node Createtree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();// hlc-->has left child
		if (hlc == true) {
			nn.left = Createtree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			nn.right = Createtree();
		}
		return nn;
	}
	public void Display() {
		Display(this.root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "";
		str = str + nn.data;
		str = "<--" + str + "-->";
		if (nn.left != null) {
			str = nn.left.data + str;
		} else {
			str = "." + str;
		}
		if (nn.right != null) {
			str = str + nn.right.data;
		} else {
			str = str + ".";
		}
		System.out.println(str);
		Display(nn.left);//left subtree visit
		Display(nn.right);//right subtree visit

	}
	public int max() {
		return max(this.root);
	}
	private int max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		int leftmax = max(nn.left);
		int rightmax = max(nn.right);
		return Math.max(leftmax, Math.max(nn.data, rightmax));
	}
	public boolean find(int item) {
		return find(item ,this.root);
	}

	private boolean find(int item, Node nn) {
		if(nn==null) {
			return false;
		}
		if(nn.data==item) {
			return true;
		}
		return find(item,nn.left) || find(item,nn.right);
	}
	
	public int height() {
		return height(this.root);
	}
	private int height(Node nn) {
		if(nn==null) {
			return -1;
		}
		int leftheight = height(nn.left);
		int rightheight = height(nn.right);
		return Math.max(leftheight,rightheight)+1;
	}
}
