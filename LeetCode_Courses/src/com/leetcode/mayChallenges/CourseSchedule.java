package com.leetcode.mayChallenges;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {

	public static void main(String[] args) {
		int numCourses = 2;
		int[][] prerequisites = {{1,0},{0,1}};
		System.out.println(canFinish(numCourses,prerequisites));

	}
	 public static boolean canFinish(int numCourses, int[][] prerequisites) {
	     int N=numCourses;
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
	            if(isCyclic(nodelist,visited,recursionStack,i))
	                return false;
	       }
	        return true;
	    }

	     public static boolean isCyclic( List<Integer> nodelist[], boolean visited[],boolean stck[], int i) 
	     {
	         if(stck[i])
	             return true;
	         
	         if(visited[i])
	             return false;
	         visited[i]=true;
	         stck[i]=true;
	        
	         for(Integer v:nodelist[i])
	         {
	             
	                if(isCyclic(nodelist,visited,stck,v))
	                    return true;
	            
	         }
	         stck[i]=false;
	         return false;
	         
	    }

}
