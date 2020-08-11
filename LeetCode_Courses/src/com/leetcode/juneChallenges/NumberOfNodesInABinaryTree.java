package com.leetcode.juneChallenges;

public class NumberOfNodesInABinaryTree {
	 public int count=0;
	    public int countNodes(TreeNode root) {
	        if(root!=null)
	        {
	          count++;
	          countNodes(root.left);
	          countNodes(root.right);  
	            
	        }
	        return count;
	            
	        
	    }

}
