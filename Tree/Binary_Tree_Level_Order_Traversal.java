package Tree;
import java.util.*;
public class Binary_Tree_Level_Order_Traversal {

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
	    public List<List<Integer>> levelOrder(TreeNode root) {
	    	
	    	List<List<Integer>> result = new ArrayList<>();
	    	LinkedList<TreeNode> queue = new LinkedList<>();
	    	if(root==null) {
	    		return result;
	    	}
			queue.add(root);
			while(!queue.isEmpty()){
				int levelsize = queue.size();
				ArrayList<Integer> ll = new ArrayList<>();
				for(int i=0;i<levelsize;i++){
					TreeNode rv = queue.remove();
					ll.add(rv.val);
					if(rv.left!=null){
						queue.add(rv.left);
					}
					if(rv.right!=null){
						queue.add(rv.right);
					}
				}
				result.add(ll);
			}
			return result;
	    }
	}
}
