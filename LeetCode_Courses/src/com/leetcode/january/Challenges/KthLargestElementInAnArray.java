package com.leetcode.january.Challenges;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int findKthLargest(int[] nums, int k) {
        if(nums.length==0)
            return 0;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++)
            pq.add(nums[i]);
       for(int i=k;i<nums.length;i++){
           if(nums[i]>pq.peek()){
               pq.poll();
               pq.add(nums[i]);
           }
       }
        return pq.peek();
    }

}
