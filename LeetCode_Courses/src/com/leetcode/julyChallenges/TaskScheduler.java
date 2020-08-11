package com.leetcode.julyChallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TaskScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int leastInterval(char[] tasks, int n) {
	        HashMap<Character,Integer> hmap=new  HashMap<Character,Integer>();
	        for(char c:tasks)
	        {
	           hmap.put(c,hmap.getOrDefault(c,0)+1);
	        }
	        
	        PriorityQueue<Integer> maxheap=new  PriorityQueue<Integer>((a,b)->b-a);
	        maxheap.addAll(hmap.values());
	        int cycles=0;                                                       
	         while(!maxheap.isEmpty())
	        {
	            ArrayList<Integer> list=new ArrayList<Integer>();
	            
	            for(int i=0;i<n+1;i++)
	            {
	                if(!maxheap.isEmpty())
	                  list.add(maxheap.remove());
	            }
	            
	            for(Integer i:list)
	            {
	                if(--i>0)
	                    maxheap.add(i);
	            }
	                   
	          cycles+= (maxheap.isEmpty())?list.size():n+1;
	            
	        }
	       return cycles;
	        
	    }

}
