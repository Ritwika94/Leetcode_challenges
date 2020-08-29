package com.leetcode.august.Challenges;

public class SumOfLeftLeaves {

	
	  int maxl=0;
	    int sum=0;
	    public int sumOfLeftLeaves(TreeNode root) {
	        leftleafsum(root);
	        return sum;
	    }
	     public int leftleafsum(TreeNode root) 
	     {
	         if(root==null)
	             return 0;
	        
	            
	             if(root.left==null && root.right==null)
	             {
	               
	                 return root.val;
	             }
	    
	         int val=leftleafsum(root.left);
	         sum+=val;
	         leftleafsum(root.right);
	         
	         return 0;
	         
	      }

}
