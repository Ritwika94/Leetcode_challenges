package com.leetcode.december.Challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class JumpGameIV {
	 static class Item{
			int index;
			int dist;
			Item(int index,int dist){
				this.index=index;
				this.dist=dist;
			}
		}
	public static void main(String[] args) {
		int[] arr= {100,-23,-23,404,100,23,23,23,3,404};
		System.out.println(minJumps(arr));

	}
	
	  
	    public static int minJumps(int[] arr) {
	        int n=arr.length;
	        if(n==1 || n==0)
	            return 0;
	        Map<Integer, List<Integer>> graph = new HashMap<>();
	         for (int i=0; i<arr.length; i++)
	             graph.computeIfAbsent(arr[i], x->new LinkedList<>()).add(i);

	            
	       
	        Queue<Item> q=new LinkedList<>();
	        boolean visited[]=new boolean[arr.length];
	        Arrays.fill(visited,false);
	        q.add(new Item(0,0));
	        visited[0]=true;
	       
	        while(!q.isEmpty()){
	            Item item=q.remove();
	            if(item.index==n-1){
	                return item.dist;
	            }
	           List<Integer>  next = graph.get(arr[item.index]);
	            next.add(item.index+1);
	             next.add(item.index-1);
	        
	            for(Integer v: next){
	                if(v >= 0 && v<arr.length &&!visited[v]){
	                
	                     q.add(new Item(v,item.dist+1));
	                     visited[v]=true;
	                }
	                   
	            }
	          
	          next.clear();
	        }
	        return 0;
	    }

}
