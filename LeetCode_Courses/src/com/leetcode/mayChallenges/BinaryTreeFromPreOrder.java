package com.leetcode.mayChallenges;

public class BinaryTreeFromPreOrder {
	public static  TreeNode root=null;
	public static void main(String[] args) {
		int[] preorder= {8,5,1,7,10,12};
		bstFromPreorder(preorder);

	}
	public static TreeNode bstFromPreorder(int[] preorder) {
	       
        for(int i=0;i<preorder.length;i++)
        {
            root=constructbst(root,preorder[i]);
       }
        return root;
    }
    
    public static TreeNode constructbst(TreeNode root,int val) {
        if(root==null)
        {
            root=new TreeNode(val);
            return root;
        }
        if(root.val>val)
        {
             
             root.left=constructbst( root.left,val);
        }
           
        else 
            root.right=constructbst( root.right,val);
        
        return root;
    }

}
