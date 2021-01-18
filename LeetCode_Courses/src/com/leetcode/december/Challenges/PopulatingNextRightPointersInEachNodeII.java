package com.leetcode.december.Challenges;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeII {
	static class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}
	    
	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, Node _left, Node _right, Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}public Node connect(Node root) {
        if(root==null)
            return null;
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			
			while(q.peek()!=null) {
			Node temp=q.remove();
			Node nextNode=q.peek();
			if(nextNode!=null) {
				temp.next=nextNode;
			}
			else {
				temp.next=null;
			}
		
			
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
			}
			q.remove();
			if(!q.isEmpty())
				q.add(null);
			
		}
		
		return root;
	
        
    }

}
