package ChaperEight.Tree;
/**
 * THIS TREE IS ordinary binary tree
 * @author Administrator
 *
 */

public class LCA2 {
	public static TreeNode LCA2(TreeNode root, TreeNode p , TreeNode q){
		if(root==null||q==null||p==null) return null;
		if(root==q||root==p) return root;
		TreeNode left = LCA2(root.left, p, q);
		TreeNode right = LCA2(root.right, p, q);
		if(left!=null&&right != null){
			return root;
		}
		return left==null? right :left;
		
	}

}
