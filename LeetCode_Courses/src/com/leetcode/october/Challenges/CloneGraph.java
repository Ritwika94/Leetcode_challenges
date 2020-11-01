package com.leetcode.october.Challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CloneGraph {
	static class Node {
	    public int val;
	    public List<Node> neighbors;
	    
	    public Node() {
	        val = 0;
	        neighbors = new ArrayList<Node>();
	    }
	    
	    public Node(int _val) {
	        val = _val;
	        neighbors = new ArrayList<Node>();
	    }
	    
	    public Node(int _val, ArrayList<Node> _neighbors) {
	        val = _val;
	        neighbors = _neighbors;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public Node cloneGraph(Node node) {
	        if(node==null)
	            return null;
	      
	        HashMap<Node,Node> hmap=new HashMap();
	        Queue<Node> q=new LinkedList<>();
	        hmap.put(node,new Node(node.val));
	        q.add(node);
	        while(!q.isEmpty()){
	            Node u=q.poll();
	            Node cloned=hmap.get(u);
	            List<Node> list=u.neighbors;
	            if(!list.isEmpty()){
	                 for(Node v:list){
	                     Node cloneNodeG = hmap.get(v); 
	                     if(cloneNodeG==null){
	                          q.add(v);
	                          cloneNodeG=new Node(v.val);
	                          hmap.put(v,cloneNodeG);
	                         
	                     }
	                        
	                    
	                     cloned.neighbors.add(cloneNodeG);
	                 }
	            }
	           
	            
	        }
	       return hmap.get(node) ;
	        
	    }

}
