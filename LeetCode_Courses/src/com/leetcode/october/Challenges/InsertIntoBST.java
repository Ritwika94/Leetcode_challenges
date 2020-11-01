package com.leetcode.october.Challenges;

public class InsertIntoBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public TreeNode insertIntoBST(TreeNode root, int val) {
	        if(root==null){
	            TreeNode temp=new TreeNode(val);
	            return temp;
	        }
	      
	        if(root.val>val){
	            root.left=insertIntoBST(root.left,val);
	        }
	        else if(root.val<val){
	               root.right=insertIntoBST(root.right,val);
	        }
	        
	        return root;
	        
	    }

}
