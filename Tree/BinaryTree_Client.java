package Tree;

public class BinaryTree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
     	bt.Display();
//		System.out.println(bt.max());
//		System.out.println(bt.find(70));
//		System.out.println(bt.ht());
		bt.PreOrder();
		bt.POStOrder();
		bt.INOrder();
	}

}
