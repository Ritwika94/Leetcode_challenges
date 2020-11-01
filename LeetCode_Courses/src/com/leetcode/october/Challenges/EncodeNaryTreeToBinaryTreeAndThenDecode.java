package com.leetcode.october.Challenges;

import java.util.ArrayList;

public class EncodeNaryTreeToBinaryTreeAndThenDecode {
	static public class TreeNode {
		int val;
		TreeNode left;
	    TreeNode right;
	    ArrayList<TreeNode> children=null;
	    TreeNode() {}
	    TreeNode(int val) { this.val = val; children=new ArrayList();}
	    TreeNode(int val, TreeNode left, TreeNode right) {
	      this.val = val;
	       this.left = left;
	      this.right = right;
	     }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static TreeNode encode(TreeNode root) {
		if(root==null)
			return null;
		TreeNode res=new TreeNode(root.val);
		if(!root.children.isEmpty()) {
			res.left=root.children.get(0);
		}
		TreeNode curr=res.left;
		for(int i=0;i<res.children.size();i++) {
			curr.right=encode(res.children.get(i));
			curr=curr.right;
		}
		return res;
		
	}
	public static TreeNode decode(TreeNode root) {
		if(root==null)
			return null;
		TreeNode res=new TreeNode(root.val);
		
		TreeNode curr=res.left;
		while(curr!=null){
			res.children.add(decode(curr));
			curr=curr.right;
		}
		return res;
		
	}

}
