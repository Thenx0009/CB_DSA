package Tree;

import java.util.*;



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
		boolean hrc = sc.nextBoolean();// hrc-->has right child
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
	//Preorder Traversal
	public void preorder() {
		preorder(this.root);
		System.out.println();
	}
	private void preorder(Node nn) {
		if(nn==null) {
			return;
		}
		//first print the root data
		//second print the leftsubtree call data
		//third print the rightsubtree call data
		System.out.print(nn.data+" ");
		preorder(nn.left);
		preorder(nn.right);
	}
	//POStOrder Traversal
	public void POSt0rder() {
		POStOrder(this.root);
		System.out.println();
	}
	public void POStOrder(Node nn) {
		if(nn==null) {
			return;
		}
		//first print the leftsubtree call data
		//second print the rightsubtree call data
		//third print the root data
		POStOrder(nn.left);
		POStOrder(nn.right);
		System.out.print(nn.data+" ");
	}
	//INOrder Traversal
	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}
	private void INOrder(Node nn) {
		if(nn==null) {
			return;
		}
		//first print leftsubtree call data
		//second print the root data
		//third print the rightsubtree call data
		INOrder(nn.left);
		System.out.print(nn.data+" ");
		INOrder(nn.right);
	}
	//level order traversal
	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node rv = queue.remove();
			System.out.print(rv.data+" ");
			if(rv.left!=null) {
				queue.add(rv.left);
			}
			if(rv.right!=null) {
				queue.add(rv.right);
			}
		}
	}
}
