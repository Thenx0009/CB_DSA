package Leetcode;

public class Maximum_Difference_Between_Node_and_Ancestor {

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

	class Solution {
		private int helper(TreeNode root, int max, int min) {
			if (root == null) {
				return max - min;
			}
			max = Math.max(max, root.val);
			min = Math.min(min, root.val);
			return Math.max(helper(root.left, max, min), helper(root.right, max, min));
		}

		public int maxAncestorDiff(TreeNode root) {
			return helper(root, root.val, root.val);
		}
	}
}
