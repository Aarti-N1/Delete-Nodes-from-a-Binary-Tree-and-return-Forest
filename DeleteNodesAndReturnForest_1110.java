package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteNodesAndReturnForest_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
	        List<TreeNode> res = new ArrayList<TreeNode>();
	        Set<Integer> toDelete = new HashSet<Integer>();
	        for(int i:to_delete) {
	        	toDelete.add(i);
	        }
	        removeNodes(root, toDelete, res);
	        if(!toDelete.contains(root.val)){
	            res.add(root);
	        }
	        return res;
	    }
	    public static TreeNode removeNodes(TreeNode root, Set<Integer> toDelete,List<TreeNode> res){
	        if(root==null)
	            return null;
	        root.left= removeNodes(root.left, toDelete, res);
	        root.right = removeNodes(root.right, toDelete, res);
	        if(toDelete.contains(root.val)){
	            if(root.left!=null)
	                res.add(root.left);
	            if(root.right != null)
	                res.add(root.right);
	            return null;
	        }
	        return root;
	    }
}
