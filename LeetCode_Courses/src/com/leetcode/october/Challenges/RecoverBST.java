package com.leetcode.october.Challenges;

public class RecoverBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    TreeNode first,mid,last=null;
    TreeNode prev=null;
    public void recoverTree(TreeNode root) {
        makebst(root);
        if(first!=null && last!=null){
            int t=first.val;
            first.val=last.val;
            last.val=t;
        }
           else if(first!=null && mid!=null){
                int t=first.val;
            first.val=mid.val;
            mid.val=t;
           }
        
    }
      public void makebst(TreeNode root) {
          if(root==null)
              return;
          makebst(root.left);
          if(prev!=null && root.val<prev.val){
              if(first==null){
                  first=prev;
                  mid=root;
                  
              }
              else
                  last=root;
          }
          prev=root;
          makebst(root.right);
          
      }

}
