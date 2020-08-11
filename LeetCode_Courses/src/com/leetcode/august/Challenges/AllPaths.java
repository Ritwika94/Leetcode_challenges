package com.leetcode.august.Challenges;

import java.util.Vector;

public class AllPaths {
	public Vector<Integer>  pathlist=new Vector();
    public int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int pathSum(TreeNode root, int sum) {
        
		pathSumUtil(root,sum);
		return count;
    }
	public void pathSumUtil(TreeNode root, int sum) {
		if(root==null)
			return;
		pathlist.add(root.val);
		pathSumUtil(root.left,sum);
		pathSumUtil(root.right,sum);
		int sum1=0;
		for(int i=pathlist.size()-1;i>=0;i--)
		{
			 sum1+=pathlist.get(i);
			 if(sum1==sum)
				 count++;
	   }
		pathlist.remove(pathlist.size()-1);
		
		
	}
}
