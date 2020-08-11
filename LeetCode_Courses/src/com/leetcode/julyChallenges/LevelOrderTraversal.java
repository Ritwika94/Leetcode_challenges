package com.leetcode.julyChallenges;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelorderlist=new ArrayList();
        int height=heightofTree(root);
        for(int i=height;i>0;i--)
        {
            List<Integer> list=new ArrayList();
            levelorder(root,i,list);
            levelorderlist.add(list);
        }
        return levelorderlist;
        
    }
    
     public List<Integer> levelorder(TreeNode root, int i,  List<Integer> list ) 
     {
         if(root==null)
             return list;
         
        List<Integer> l;
        if(i==1)
        {
          list.add(root.val);
           return list;
         }
        
         l=levelorder(root.left,i-1,list);
         l=levelorder(root.right,i-1,l);
         
         return l;
     }
    
     public int heightofTree(TreeNode root) 
     {
         if(root!=null)
         {
             int lh=heightofTree(root.left);
             int rh=heightofTree(root.right);
             return Math.max(lh,rh)+1;
         }
         return 0;
     }

}
