package Leetcode;

import java.util.*;

public class Binary_Tree_Inorder_Traversal {

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
		public List<Integer> inorderTraversal(TreeNode root) {
			ArrayList<Integer> result = new ArrayList<>();
			inorderTraversalHelper(root, result);
			return result;
		}

		private void inorderTraversalHelper(TreeNode root, List<Integer> result) {
			if (root == null) {
				return;
			}
			inorderTraversalHelper(root.left, result);
			result.add(root.val);
			inorderTraversalHelper(root.right, result);
		}
	}

}
