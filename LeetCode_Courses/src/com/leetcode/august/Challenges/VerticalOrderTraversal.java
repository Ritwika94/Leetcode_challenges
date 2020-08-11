package com.leetcode.august.Challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  class Node {
	        int x;
	        int y;
	        int val;
	        public Node(int x, int y, int val) {
	            this.x = x;
	            this.y = y;
	            this.val = val;
	        }
	    }
	 public List<List<Integer>> verticalTraversal(TreeNode root) {
	        List<List<Integer>>  alist=new ArrayList();
	        if(root==null)
	            return alist;
	        Map<Integer,List<Integer>> map = new TreeMap<>();
	         List<Node> list = new ArrayList();
	         addNodes(root, 0, 0, list);
	         Collections.sort(list, (p1, p2) -> p1.x == p2.x ? p1.y == p2.y ? p1.val- p2.val : p2.y - p1.y : p1.x -            p2.x);
	           for(Node p:list)
	           {
	                List<Integer> list1 = map.getOrDefault(p.x, new ArrayList());
	                list1.add(p.val);
	                map.put(p.x, list1);
	           }
	    
	       for (Map.Entry<Integer,List<Integer>> entry : map.entrySet()) 
	         {
	             alist.add(entry.getValue());
	          }
	         
	        return alist;
	    } 

	    private void addNodes(TreeNode root, int x, int y, List<Node> list) {
	        if (root == null) 
	            return; 
	        list.add(new Node(x, y, root.val));
	        addNodes(root.left, x - 1, y - 1, list);
	        addNodes(root.right, x + 1, y - 1, list);
	    }

}
