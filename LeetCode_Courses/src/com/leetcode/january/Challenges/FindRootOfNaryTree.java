package com.leetcode.january.Challenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindRootOfNaryTree {
	static class Node {
	    int val;
	    List<Node> children = new ArrayList<>();

		Node(int val) {
			this.val = val;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Node findRoot(List<Node> tree) {
		HashSet<Node> parentNodeList=new HashSet();
		HashSet<Node> childNodeList=new HashSet();
		
		for(Node node:tree) {
			if(!childNodeList.contains(node))
				parentNodeList.add(node);
			for(Node child:node.children) {
				if(parentNodeList.contains(child))
					parentNodeList.remove(child);
				childNodeList.add(child);
			}
		}
		return parentNodeList.iterator().next();
	}

}
