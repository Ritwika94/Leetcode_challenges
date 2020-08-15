package com.leetcode.august.Challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class NonOverLappingIntervals {

	public static void main(String[] args) {
		int[][] intervals= {{1,2},{2,3},{3,4},{1,3}};
		System.out.println(eraseOverlapIntervals(intervals));
	
	}
	public static int eraseOverlapIntervals(int[][] intervals) {
		if (intervals.length==1 ||intervals.length==0) {
            return 0;
        }
		Arrays.sort(intervals,new Comparator<int[]>() {
	           @Override
	            public int compare(int[] a, int[] b) {
	                return a[0] - b[0];
	            }
	        });
	int end=intervals[0][1];
	int count=0;
	for(int i=1;i<intervals.length;i++)
	{
		if(intervals[i][0]<end)
		{
			end=Math.min(intervals[i][1],end);
			count++;
		}
		else
			end=intervals[i][1];
	}
	return count;
}
}
