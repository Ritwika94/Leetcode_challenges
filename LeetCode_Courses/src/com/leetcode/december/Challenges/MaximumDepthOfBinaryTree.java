package com.leetcode.december.Challenges;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  int res=Integer.MIN_VALUE;
	    public int maxDepth(TreeNode root) {
	         if(root==null)
	               return 0;
	            findDepth(root,0);
	            return res;
	    }
	     public void findDepth(TreeNode root, int level) {
	           if(root==null)
	               return;
	         if(root.left==null && root.right==null){
	             res=Math.max(res,level+1);
	             return;
	         }
	       findDepth(root.left,level+1); 
	       findDepth(root.right,level+1);  
	         
	    }

}
