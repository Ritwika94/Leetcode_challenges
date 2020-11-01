package com.leetcode.october.Challenges;

import java.util.Arrays;
import java.util.Comparator;

public class RemoveCoveredIntervals {

	public static void main(String[] args) {
	int[][] intervals = {{1,4},{3,6},{2,8}};
	System.out.println(removeCoveredIntervals(intervals));

	}
	 public static int removeCoveredIntervals(int[][] intervals) {

	        int count=0;
	        int n=intervals.length;
	    	Arrays.sort(intervals,new Comparator<int[]>() {
		           @Override
		            public int compare(int[] a, int[] b) {
		                return a[0] - b[0];
		            }
		        });
	    	int end=intervals[0][1];
	    	int start=intervals[0][0];
	    	for(int i=1;i<intervals.length;i++) {
	    		if((intervals[i][0]>=start && intervals[i][1]<=end) || (intervals[i][0]<=start && 
                                                                    intervals[i][1]>=end))
	    			count++;

	    		if(intervals[i][0]<end)
	    		{
	    			end=Math.max(intervals[i][1],end);
	    			
	    		}
	    		else
	    			end=intervals[i][1];
	    	}
	        return n-count;
	    
	 }

}
