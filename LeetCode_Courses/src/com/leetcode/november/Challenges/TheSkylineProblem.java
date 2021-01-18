package com.leetcode.november.Challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class TheSkylineProblem {
	 static class Edge{
	        int x;
	        int ht;
	        boolean isStart;
	        public Edge(int x, int ht, boolean isStart) {
			this.x = x;
			this.ht = ht;
			this.isStart = isStart;
		}
	    }
	public static void main(String[] args) {
		int[][] buildings= {{2,9 ,10}, {3 ,7, 15}, {5, 12 ,12}, {15 ,20 ,10}, {19, 24 ,8}};
		System.out.println(getSkyline(buildings));

	}

	    public static List<List<Integer>> getSkyline(int[][] buildings) {
	       List<List<Integer>> res=new ArrayList();
	        if(buildings==null || buildings.length==0 ||buildings[0].length==0)
	            return res;
	        List<Edge> edges = new ArrayList<Edge>();
	        for(int[] building:buildings){
	            Edge start=new Edge(building[0],building[2],true);
	            edges.add(start);
	            Edge end=new Edge(building[1],building[2],false);
	            edges.add(end);
	        }
	        Collections.sort(edges, new Comparator<Edge>(){
	            public int compare(Edge a, Edge b){
	                if(a.x!=b.x)
	                    return Integer.compare(a.x,b.x);
	                else if(a.isStart && b.isStart)
	                    return Integer.compare(b.ht,a.ht);
	                else if(!a.isStart && !b.isStart)
	                    return Integer.compare(a.ht,b.ht);
	               return a.isStart ? -1 : 1;
	            }
	        });
	        
	        PriorityQueue<Integer> pq=new  PriorityQueue<Integer>(Collections.reverseOrder());
	        
	        for(Edge e:edges){
	            if(e.isStart){
	                 if(pq.isEmpty() || e.ht>pq.peek()){
	                     ArrayList<Integer> al=new ArrayList();
	                     al.add(e.x);
	                     al.add(e.ht);
	                    res.add(al);
	                }
	                pq.add(e.ht);
	            }
	            else{
	                pq.remove(e.ht);
	                if(pq.isEmpty()){
	                     ArrayList<Integer> al=new ArrayList();
	                     al.add(e.x);
	                     al.add(0);
	                    res.add(al);
	                }
	                else if(e.ht>pq.peek()){
	                    ArrayList<Integer> al=new ArrayList();
	                     al.add(e.x);
	                     al.add(pq.peek());
	                    res.add(al);
	                }
	                    
	            }
	           
	        }
	        return res;
	        
	    }

}
