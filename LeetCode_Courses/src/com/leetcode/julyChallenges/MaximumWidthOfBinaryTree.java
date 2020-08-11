package com.leetcode.julyChallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
	ArrayList<Integer> al=new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int widthOfBinaryTree(TreeNode root) {
	       
		   if (root == null) {
	            return 0;
	        }
	        Queue<TreeNode> queue = new LinkedList<>();
	        int max = 1, leftmost = 1, rightmost = 1;
	        root.val = 1;
	        queue.offer(root);
	        while (!queue.isEmpty()) {
	            int size = queue.size();
	            for (int i = 0; i < size; i++) {
	                TreeNode cur = queue.poll();
	                if (i == 0) {
	                    leftmost = cur.val;
	                }
	                if (i == size - 1) {
	                    rightmost = cur.val;
	                }
	                if (cur.left != null) {
	                    cur.left.val = cur.val * 2;
	                    queue.offer(cur.left);
	                }
	                if (cur.right != null) {
	                    cur.right.val = cur.val * 2 + 1;
	                    queue.offer(cur.right);
	                }
	            }
	            max = Math.max(max, rightmost - leftmost + 1);

	        }
	        return max;
	   }	
}
