package com.leetcode.mayChallenges;

public class CousinNodes {

	 public boolean isCousins(TreeNode root, int x, int y) {
	     int d1=  calculateDepth(root,x,0);
		 int d2=  calculateDepth(root,y,0);
		 int p1=  calculateParent(root,x);
		 int p2=  calculateParent(root,y);
	     System.out.println(d1+" "+d2+" "+p1+" "+p2); 
		 if(d1==d2 && p1!=p2 )
			 return true;
		 
		return false;
	        
	    }
	    public int calculateParent(TreeNode root, int x) {
		if(root==null)
			return -1;
		int lp=0;
		int rp=0;
		if((root.left != null &&root.left.val==x) || (root.right!=null &&root.right.val==x))
			return root.val;
		if(root.left != null)
		{
			lp=calculateParent(root.left,x);
		}
		if(root.right != null)
		{
			rp=calculateParent(root.right,x);
		}
		if(lp>0)
			return lp;
		else
			return rp;
		
	}

	 public int calculateDepth(TreeNode root, int x, int level) {
		if(root==null)
			 return -1;
		else if(root.val==x)
			return level;
		int ld=-1;
		int rd=-1;
		ld=calculateDepth(root.left,x,level+1);
		rd=calculateDepth(root.right,x,level+1);
		if(ld>-1)	
		  return ld;
		else
			return rd;
	}

}
