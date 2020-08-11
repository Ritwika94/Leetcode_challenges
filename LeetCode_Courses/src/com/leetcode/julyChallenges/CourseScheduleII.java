package com.leetcode.julyChallenges;

import java.util.ArrayList;
import java.util.List;

public class CourseScheduleII {

	public static void main(String[] args) {
		int numCourses = 2;
		int[][] prerequisites = {{0,1},{1,0}};
		int arr[]=new int[numCourses];
		arr=findOrder(numCourses,prerequisites);
		for(int i=0;i<numCourses;i++)
			System.out.print(arr[i]+" ");

	}
	public static int[] findOrder(int numCourses, int[][] prerequisites) {
	     int N=numCourses;
	     List<Integer> vertexlist=new ArrayList();
	     List<Integer> nodelist[]=new ArrayList[N];
			for(int i=0;i<N;i++)
			{
				nodelist[i]=new ArrayList<Integer>();
			}
			
			
			for(int i=0;i<prerequisites.length;i++)
			{
				int x=prerequisites[i][0];
				int y=prerequisites[i][1];
				nodelist[x].add(y);
				
				
			}
	        boolean visited[]=new boolean[N];
	        boolean recursionStack[]=new boolean[N];
	        for(int i=0;i<N;i++)
	        {
	            visited[i]=false;
	            recursionStack[i]=false;
	        }
	      
	        for(int i=0;i<N;i++)
	        {
	            if(isCyclic(nodelist,visited,recursionStack,i,vertexlist))
	            {
	            	int arr[]= {};
	            	return arr;
	            }
	                
	       }
	       int arr1[]=vertexlist.stream().mapToInt(i -> i).toArray();
	       return arr1;
	    }

	     public static boolean isCyclic( List<Integer> nodelist[], boolean visited[],boolean stck[], int i, List<Integer> vertexlist) 
	     {
	         if(stck[i])
	             return true;
	         
	         if(visited[i])
	             return false;
	         visited[i]=true;
	         stck[i]=true;
	         
	        
	         for(Integer v:nodelist[i])
	         {
	        	 
	                if(isCyclic(nodelist,visited,stck,v,vertexlist))
	                    return true;
	                if(!vertexlist.contains(v))
	                	vertexlist.add(v);
	            
	         }
	         vertexlist.add(i);
	         stck[i]=false;
	         return false;
	         
	    }

}
