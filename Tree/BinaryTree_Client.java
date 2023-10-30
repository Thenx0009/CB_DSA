package Tree;

public class BinaryTree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Tree bt = new Binary_Tree();
     	bt.Display();
//		System.out.println(bt.max());
//		System.out.println(bt.find(70));
//		System.out.println(bt.ht());
		bt.preorder();
		bt.POSt0rder();
		bt.INOrder();
		bt.levelOrder();
	}

}
