package com.leetcode.december.Challenges;

public class IncreasingOrderSearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  TreeNode ans=null;
	    public TreeNode increasingBST(TreeNode root) {
	        TreeNode res=new TreeNode(0);
	        ans=res;
	        helper(root);
	        return res.right;
	        
	        
	    }
	     public void helper(TreeNode root){
	         if(root==null)
	             return ;
	         helper(root.left);
	         ans.right=root;
	         ans=ans.right;
	         helper(root.right);
	         root.left=null;
	   
	    }

}
