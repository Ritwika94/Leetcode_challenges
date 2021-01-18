package com.leetcode.november.Challenges;

public class HouseRobberIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   public int rob(TreeNode root) {
	        
	       if(root==null)
	           return 0;
	        int result[]=findmax(root);
	        return Math.max(result[0],result[1]);
	    }
	     public int[] findmax(TreeNode root) {
	         if(root==null)
	          {
	             int res[]=new int[2];
	             res[0]=0;
	             res[1]=0;
	             return res;
	         }
	        int res[]=new int[2];
	        int left[]=findmax(root.left);
	        int right[]=findmax(root.right);
	         
	        res[0]=root.val+left[1]+right[1];
	        res[1]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
	         return res;
	         
	     }

}
