package com.leetcode.mayChallenges;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersection {

	public static void main(String[] args) {
		int[][] A= {{0,2},{5,10},{13,23},{24,25}};
		int[][] B= {{1,5},{8,12},{15,24},{25,26}};
		System.out.println(intervalIntersection(A,B));
	}
	
	public static int[][] intervalIntersection(int[][] A, int[][] B) {
        int i=0;
        int j=0;
        List<int[]>  list=new ArrayList();
        while(i<A.length && j<B.length)
        {
            int start=Math.max(A[i][0],B[j][0]);
            int end=Math.min(A[i][1],B[j][1]);
            
            if(start<=end)
                 list.add(new int[]{start,end});
            
            if(A[i][1]<B[j][1])
                i++;
            else
                j++;
            
        }
        
        return list.toArray(new int[list.size()][]);
        
    }
}
