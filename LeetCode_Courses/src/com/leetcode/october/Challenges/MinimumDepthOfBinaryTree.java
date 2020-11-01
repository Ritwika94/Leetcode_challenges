package com.leetcode.october.Challenges;

public class MinimumDepthOfBinaryTree {

	public static void main(String[] args) {
		
	}
	 int result=Integer.MAX_VALUE;
	    public int minDepth(TreeNode root) {
	        if(root==null )
	            return 0;
	        findmin(root,1);
	        return result;
	        
	    }
	     public void findmin(TreeNode root,int depth){
	         if(root==null)
	             return;
	         if(root.left==null && root.right==null){
	             result=Math.min(result,depth);
	         }
	         findmin(root.left,depth+1);
	         findmin(root.right,depth+1);
	     }

}
