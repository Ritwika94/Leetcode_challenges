package com.leetcode.november.Challenges;

public class MaximumDifferenceBetweenNodeAndAncestor {

	public static void main(String[] args) {
		

	}
	 int maxVal=Integer.MIN_VALUE;
	   
	public int maxAncestorDiff(TreeNode root) {
	        if(root==null)
	            return 0;
	        calcMax(root);
	       
	         return maxVal;
	    }
	     public void calcMax(TreeNode root){
	         if(root==null)
	            return ;
	        calcMax(root.left);
	        calcMax(root.right);
	        int min_desc=findmin(root);
	        int max_desc=findmax(root);
	        System.out.println(min_desc +" "+max_desc);
	        if(Math.abs(root.val-max_desc)<Math.abs(root.val-min_desc))
	            maxVal=Math.max(maxVal,Math.abs(root.val-min_desc));
	        else{
	             maxVal=Math.max(maxVal,Math.abs(root.val-max_desc));
	        }
	         
	     }
	       
	     public int findmin(TreeNode root){
	         if(root==null)
	             return Integer.MAX_VALUE;
	         int min=root.val;
	         if(root.left==null && root.right==null)
	             return min;
	         int ls=findmin(root.left);
	         int rs=findmin(root.right);
	         if(min>ls)
	             min=ls;
	         if(rs<min)
	             min=rs;
	         return min;
	         
	     }
	     public int findmax(TreeNode root){
	         if(root==null)
	             return Integer.MIN_VALUE;
	         int max=root.val;
	          if(root.left==null && root.right==null)
	             return max;
	         int ls=findmax(root.left);
	         int rs=findmax(root.right);
	         if(max<ls)
	             max=ls;
	         if(rs>max)
	             max=rs;
	         return max;
	         
	     }

}
