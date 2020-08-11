package com.leetcode.mayChallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class KNearestPointsToOrigin {

	public static void main(String[] args) {
		int[][] points = {{3,3},{5,-1},{-2,4}};
		int K=2;
		System.out.println(kClosest(points,K));

	}
	
	public static int[][] kClosest(int[][] points, int K) {
	    HashMap< Double,List<Integer>> hmap=new HashMap<Double,List<Integer>>();
	     PriorityQueue<Double> mheap=new  PriorityQueue<>();
	     for(int i=0;i<points.length;i++)
	     {
	         int x=points[i][0];
	         int y=points[i][1];
	         double z=Math.sqrt(x*x+y*y);
	         hmap.compute(z,(k,v)->v==null?new ArrayList():v).add(i);
	         mheap.add(z);
	     }
	    
	       int count=0;
	       
	       int arr[][]=new int[K][2];
	         while(!mheap.isEmpty() && count<K)
	        {
	            List<Integer> alist=hmap.get(mheap.poll());
	             for(int j:alist) 
	                 arr[count++]=points[j];
	            
	        }
	     
	     return arr;
	    

	        
	    }

}
