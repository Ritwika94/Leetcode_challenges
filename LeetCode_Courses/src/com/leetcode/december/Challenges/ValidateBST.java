package com.leetcode.december.Challenges;

public class ValidateBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  TreeNode prev=null;
	    public boolean isValidBST(TreeNode root) {
	        if(root==null)
	            return true;
	        
	        if(!isValidBST(root.left)){
	            return false;
	        }
	        
	        if(prev!=null && root.val<=prev.val)
	            return false;
	        prev=root;
	        
	        return isValidBST(root.right);
	    }

}
