package com.leetcode.december.Challenges;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int val=checkBalance(root);
        System.out.println(val);
        if(val>0)
            return true;
       
         return false;
     }
    public int checkBalance(TreeNode root){
        if(root==null)
            return 0;
        int ls=checkBalance(root.left);
        int rs=checkBalance(root.right);
         System.out.println("Root:"+root.val);
         System.out.println("LS:"+ls);
         System.out.println("RS:"+rs);
        if(ls==-1 || rs==-1){
             System.out.println("Hello");
             return -1;
        }
           
        if(Math.abs(ls-rs)>1){
           System.out.println("Hi");
             return -1;
        }
           
       
        return Math.max(ls,rs)+1;
       }

}
