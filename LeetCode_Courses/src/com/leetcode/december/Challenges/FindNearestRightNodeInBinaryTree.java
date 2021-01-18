package com.leetcode.december.Challenges;

import java.util.LinkedList;
import java.util.Queue;

public class FindNearestRightNodeInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static TreeNode nearestRightNode(TreeNode root,TreeNode u) {
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		
		boolean found=false;
		while(!q.isEmpty()) {
			int size=q.size();
			for(int i=0;i<size;i++) {
				TreeNode temp=q.poll();
				if(found) {
					if(i==0)
						return null;
					else
						return temp;
				}
				if(root.left!=null)
					q.add(root.left);
				if(root.right!=null)
					q.add(root.right);
				if(temp==u)
					found=true;
				
			}
			
		}
		return null;
		
	}

}
