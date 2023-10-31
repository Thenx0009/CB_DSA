package Tree;

public class Diameter_of_Binary_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	//Brute force
	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			if(root==null) {
				return 0;
			}
			int leftdiameter = diameterOfBinaryTree(root. left);
			int rightdiameter = diameterOfBinaryTree(root.right);
			int selfdiameter = ht(root.left)+ht(root.right)+2;
			return Math.max(leftdiameter, Math.max(rightdiameter, selfdiameter));
		}
		public int ht(TreeNode root) {
			if(root==null) {
				return -1;
			}
			int left = ht(root.left);
			int right = ht(root.right);
			return Math.max(left, right)+1;
		}
	}
}
