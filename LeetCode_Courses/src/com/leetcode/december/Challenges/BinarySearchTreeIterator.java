package com.leetcode.december.Challenges;

import java.util.Stack;

public class BinarySearchTreeIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} 
	Stack<TreeNode> stack;
	 
		public BinarySearchTreeIterator(TreeNode root) {
			stack = new Stack<TreeNode>();
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
		}
	 
		public boolean hasNext() {
			return !stack.isEmpty();
		}
	 
		public int next() {
			TreeNode node = stack.pop();
			int result = node.val;
			if (node.right != null) {
				node = node.right;
				while (node != null) {
					stack.push(node);
					node = node.left;
				}
			}
			return result;
		}

}
