package com.leetcode.February.Challenges;

public class TrimABinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null)
            return null;
        TreeNode node=null,left=null,right=null;
       
        if(root.val>=low && root.val<=high)
            node=new TreeNode(root.val);
        //System.out.println(node.val);
        if(node!=null)
            node.left=trimBST(root.left,low,high);
         if(node!=null)
            node.right=trimBST(root.right,low,high);
        if(node==null && root.val<low)
            left=trimBST(root.right,low,high);
         if(node==null && root.val>high)
            left=trimBST(root.left,low,high);
        return node!=null?node:(left==null)?right:left;
    }

}
