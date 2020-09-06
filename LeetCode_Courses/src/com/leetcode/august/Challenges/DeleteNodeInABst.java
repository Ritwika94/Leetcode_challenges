package com.leetcode.august.Challenges;

public class DeleteNodeInABst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode deleteNode(TreeNode root, int key) {
	      
        if(root==null)
            return root;
        if(root.val==key)
        {
            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;
            TreeNode temp=inorderSuccesor(root);
            root.val=temp.val;
            root.right = deleteNode(root.right, temp.val);
            return root;
            
        }
        if(root.val>key)
          {
              
              root.left=deleteNode(root.left,key);
              
          }
          if(root.val<key)
          {
             
              root.right=deleteNode(root.right,key);
              
          }
        return root;
    }
      
    
     public TreeNode inorderSuccesor(TreeNode root) 
     {
         TreeNode curr=root.right;
         while(curr!=null && curr.left!=null)
             curr=curr.left;
         return curr;
        
      }

}
