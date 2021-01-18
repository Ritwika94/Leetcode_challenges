package com.leetcode.november.Challenges;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGame3 {

	public static void main(String[] args) {
		int[] arr= {4,2,3,0,3,1,2};
		int start=5;
		System.out.println(canReach(arr,start));

	}
	public static boolean canReach(int[] arr, int start) {
        int n=arr.length;
        Queue<Integer> q=new LinkedList();
        q.add(start);
        int visited[]=new int[n];
        visited[start]=1;
        while(!q.isEmpty()){
             int x=q.poll();
          if(arr[x]==0)
                return true;
            if(isSafe(x-arr[x],n,visited)){
                visited[x-arr[x]]=1;
                 q.add(x-arr[x]);
            }
              
            if(isSafe(x+arr[x],n,visited)){
                 visited[x+arr[x]]=1;
                  q.add(x+arr[x]);
            }
              
         
          
        }
        
        return false;
    }
    
     public static boolean isSafe(int index,int n, int visited[]) {
         return (index>=0 && index<=n-1 && visited[index]!=1);
     }

}
