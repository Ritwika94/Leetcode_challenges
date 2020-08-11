package com.leetcode.julyChallenges;

import java.util.ArrayList;
import java.util.List;

public class ZigZalTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 boolean itr=true;
	    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	         
	        List<List<Integer>> nodesList=new ArrayList();
	        if(root==null)
	            return nodesList;
	        int height=findHeight(root);
	        
	        for(int i=1;i<=height;i++)
	        {
	            List<Integer> list=new  ArrayList();
	            getzigzag(root,list,i);
	            nodesList.add(list);
	            itr=!itr;
	        }
	        return nodesList;
	    }
	    
	     public void getzigzag(TreeNode root , List<Integer> list, int level) 
	     {
	         if(root ==null)
	             return;
	         
	         if(level==1)
	         {
	             list.add(root.val);
	             return;
	         }
	         if(itr)
	         {
	             getzigzag(root.left,list,level-1);
	             getzigzag(root.right,list,level-1);
	             
	         }
	         if(!itr)
	         {
	             
	            getzigzag(root.right,list,level-1);
	             getzigzag(root.left,list,level-1);
	             
	         }
	    }
	    public int findHeight(TreeNode root)
	    {
	        if(root!=null)
	        {
	            int ls=findHeight(root.left);
	            int rs=findHeight(root.right);
	            return Math.max(ls,rs)+1;
	        }
	        return 0;
	            
	    }

}
