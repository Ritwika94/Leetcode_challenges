package com.leetcode.julyChallenges;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToDestination {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		 List<List<Integer>> al=new ArrayList();
		 int v=graph.length;
			boolean[] isVisited = new boolean[v]; 
		    ArrayList<Integer> pathList = new ArrayList<>(); 
		    pathList.add(0); 
		    addAllPathsUtil(0, v-1, isVisited, pathList,graph,al);
			return al; 
		       
		    }
		public void addAllPathsUtil(Integer u, Integer d, 
	            boolean[] isVisited, 
	            List<Integer> localPathList, int[][] graph, List<List<Integer>> al) {
			    isVisited[u] = true; 

		        if (u.equals(d)) { 
	                System.out.println(localPathList); 
		            al.add(0, localPathList);
		            isVisited[u] = false; 
		            return; 
		        } 
		        int k=graph[u].length;
				
		        for(int j=0;j<k;j++) { 
		        	Integer i=graph[u][j];
	                System.out.println(i);
		            if (!isVisited[i]) { 
		                
		                localPathList.add(i); 
		                addAllPathsUtil(i, d, isVisited, localPathList,graph,al); 
		  
		                localPathList.remove(i); 
		            } 
		        } 
		  
		       
		        isVisited[u] = false; 
			
		}
}
