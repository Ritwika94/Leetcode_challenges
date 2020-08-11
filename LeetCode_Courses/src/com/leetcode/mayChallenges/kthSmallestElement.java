package com.leetcode.mayChallenges;

public class kthSmallestElement {
  private static int count=0;
	public static void main(String[] args) {
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(3);
		root.right=new TreeNode(6);
		root.left.left=new TreeNode(2);
		root.left.left.left=new TreeNode(1);
		root.left.right=new TreeNode(4);
		root.right.left=null;
		root.right.right=null;
		System.out.println(kthSmallest(root,3));
		

	}
public static int kthSmallest(TreeNode root, int k) {
	TreeNode node=getkthSmallest(root,k);
	if(node==null)
		return -1;
	else
		return node.val;
	
	
}
public static TreeNode getkthSmallest(TreeNode root, int k) {
	if(root==null)
		return null;
	TreeNode left=getkthSmallest( root.left, k);
	if(left!=null)
		return left;
	count++;
	if(count==k)
		return root;
	return getkthSmallest( root.right, k);
	
	
}

}
