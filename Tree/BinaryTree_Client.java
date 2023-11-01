package Tree;

public class BinaryTree_Client {
//10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false

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
		bt.printLeafNodes();
	}

}
