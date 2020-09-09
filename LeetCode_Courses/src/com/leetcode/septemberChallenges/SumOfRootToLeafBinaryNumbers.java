package com.leetcode.septemberChallenges;

import java.util.ArrayList;

public class SumOfRootToLeafBinaryNumbers {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1); 
        root.left = new TreeNode(0); 
        root.right = new TreeNode(1); 
        root.left.left = new TreeNode(0); 
        root.left.right = new TreeNode(1); 
        root.right.left = new TreeNode(0); 
        root.right.right = new TreeNode(1); 
       System.out.println(sumRootToLeaf(root));
	}
	 public static int sumRootToLeaf(TreeNode root) {
	        ArrayList<Integer> alist=new ArrayList();
			int sum=calculateSum(root,alist);
			return sum;
	        
	    }
	private static int calculateSum(TreeNode root,ArrayList<Integer> alist) {
		if(root==null)
			return 0;
		alist.add(root.val);
		
		if(root.left==null && root.right==null)
		{
			int res=calculateResult(alist);
			alist.remove(alist.size()-1);
			return res;
		}
		int ls=calculateSum(root.left,alist);
		int rs=calculateSum(root.right,alist);
		alist.remove(alist.size()-1);
		return (ls+rs);
		
	}
	private static int calculateResult(ArrayList<Integer> alist) {
	  for(int i:alist)
		  System.out.print(i+" ");
	  System.out.println();
		int n=alist.size()-1;
		int res=0;
		int j=0;
		for(int i=alist.size()-1;i>=0;i--) {
			res+=Math.pow(2,i)*alist.get(j);
			j++;
		}
		System.out.println(res);
		return res;
		
		
	}
	

}
