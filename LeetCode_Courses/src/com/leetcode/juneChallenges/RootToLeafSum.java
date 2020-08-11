package com.leetcode.juneChallenges;

public class RootToLeafSum {
	  public int sumNumbers(TreeNode root) {
	       return calculateSum(root,0);
	        
	    }
	    public int calculateSum(TreeNode root,int val) {
	      if(root==null)
	          return 0;
	      val=val*10+root.val;
	    if(root.left==null && root.right==null)
	        return val;
	    int ls=calculateSum(root.left,val);
	    int rs=calculateSum(root.right,val);
	        return (ls+rs);
	        
	    }

}
