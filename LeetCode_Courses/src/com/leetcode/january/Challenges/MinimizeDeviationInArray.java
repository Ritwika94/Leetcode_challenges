package com.leetcode.january.Challenges;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimizeDeviationInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int minimumDeviation(int[] nums) {
	        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]%2==1)
	                nums[i]=nums[i]*2;
	            pq.add(nums[i]);
	            
	        }
	        for(int x:nums)
	            min=Math.min(min,x);
	        int diff=pq.peek()-min;
	        
	        while(!pq.isEmpty() && pq.peek()%2==0){
	            int val=pq.poll();
	            pq.add(val/2);
	            min=Math.min(min,val/2);
	            diff=Math.min(diff,pq.peek()-min);
	        }
	        return diff;
	    }

}
