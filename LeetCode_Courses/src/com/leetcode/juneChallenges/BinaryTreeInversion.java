package com.leetcode.juneChallenges;

public class BinaryTreeInversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode invertTree(TreeNode root) {
		if(root==null)
			return null;
		else
		{
			root.left=invertTree(root.left);
			root.right=invertTree(root.right);
			TreeNode temp = root.left;
			root.left=root.right;
			root.right=temp;
		}
			
		return root;
        
    }

}
