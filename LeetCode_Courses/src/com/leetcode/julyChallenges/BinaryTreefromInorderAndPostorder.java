package com.leetcode.julyChallenges;

public class BinaryTreefromInorderAndPostorder {

	public static void main(String[] args) {
	

	}
	class Index
    {
        int index;
    }
	 public TreeNode buildTree(int[] inorder, int[] postorder) {
	        int n=inorder.length;
	        Index postIndex=new Index();
	        postIndex.index=n-1;
	        TreeNode node=buildBinaryTree(inorder,postorder,0,n-1,postIndex);
	        return node;
	        
	       }
	     public TreeNode buildBinaryTree(int[] inorder, int[] postorder,int start,int end,Index postIndex) {
	         if(start>end)
	             return null;
	         TreeNode node=new TreeNode(postorder[postIndex.index]);
	         postIndex.index--;
	         if(start==end)
	             return node;
	         int inIndex=search(inorder,start,end,node.val);
	         node.right=buildBinaryTree(inorder,postorder,inIndex+1,end,postIndex);
	         node.left=buildBinaryTree(inorder,postorder,start,inIndex-1,postIndex);
	         return node;
	         
	     }
	    int search(int arr[],int start,int end,int val)
	    {
	        int i=0;
	        for(i=start;i<=end;i++)
	        {
	            if(arr[i]==val)
	            {
	                
	                break;
	                 }
	          }
	        return i;
	    }

}
