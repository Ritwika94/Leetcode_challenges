package com.leetcode.december.Challenges;

public class SmallestSubtreeWithAllTheDeepestNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  TreeNode maxNode=null;
	  
	    int maxL=Integer.MIN_VALUE;
	    public TreeNode subtreeWithAllDeepest(TreeNode root) {
	        if(root.left==null && root.right==null){
	            return root;
	        }
	        deepestNodes(root,0);
	        return maxNode;
	    }
	    
	    public int deepestNodes(TreeNode root,int level) {
	       if(root==null)
	           return -1;
	       if(root.left==null && root.right==null){
	          if(maxL<=level){
	              maxNode=root;
	              maxL=level;
	              return maxL;
	          }
	           else
	               return -1;
	      }
	        int ls=deepestNodes(root.left,level+1);
	        int rs=deepestNodes(root.right,level+1);
	        
	        if(ls!=-1 && rs!=-1 &&ls==maxL && rs==maxL){
	            System.out.println(root.val);
	           
	            maxNode=root;
	        }
	           
	        if(root.left==null && rs!=-1 && maxL<level){
	             System.out.println(root.val);
	             maxL=level;
	             maxNode=root;
	        }
	            
	         if(root.right==null && ls!=-1&& maxL<level){
	                 System.out.println(root.val);
	               maxL=level;
	             maxNode=root;
	         }
	           
	        
	        return Math.max(ls,rs);
	    }

}
