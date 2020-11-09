package com.leetcode.november.Challenges;

public class BinaryTreeTilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int sum=0;
    public int findTilt(TreeNode root) {
        travNodes(root);
        return sum;
    }
     public int travNodes(TreeNode root) {
          if(root==null)
            return 0;
        int left=travNodes(root.left);
        int right=travNodes(root.right);
      
        int x=root.val+left+right;
        
        root.val=Math.abs(left-right);
        sum+=root.val;
       
        return x;
         
     }

}
