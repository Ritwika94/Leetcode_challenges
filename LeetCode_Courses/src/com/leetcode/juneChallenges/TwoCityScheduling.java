package com.leetcode.juneChallenges;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int twoCitySchedCost(int[][] costs) {
	        Comparator<int[]> comp=(a,b)->Math.abs(b[0]-b[1])-Math.abs(a[0]-a[1]);
	        Arrays.sort(costs,comp);
	        int n=costs.length/2,count1=0,count2=0,mincost=0;
	        
	        for(int i=0;i<costs.length;i++)
	        {
	            if((costs[i][0]<=costs[i][1] && count1<n)|| count2==n)
	               {
	                   
	                   mincost+=costs[i][0];
	                     count1++;
	               }
	               else
	               {
	                  
	                    mincost+=costs[i][1];
	                    count2++;
	               }
	               
	          }
	               
	               return mincost;
	        
	        
		  
		    }
	      

}
