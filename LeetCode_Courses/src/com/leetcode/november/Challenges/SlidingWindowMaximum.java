package com.leetcode.november.Challenges;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int[] nums= {1,3,-1,-3,5,3,6,7};
		int k=3;
		int arr[]=maxSlidingWindow(nums,k);
		for(int x:arr)
			System.out.print(x+" ");

	}
    static ArrayList<Integer> alist=new ArrayList();
   public static int[] maxSlidingWindow(int[] nums, int k) {
       
		Deque <Integer> pq=new LinkedList<Integer>();
		int i=0;
		for(i=0;i<k;i++){
           while(!pq.isEmpty() && nums[i]>=nums[pq.peekLast()])
               pq.removeLast();
           pq.addLast(i);
       }
		
	    for(;i<nums.length;i++){
           alist.add(nums[pq.peek()]);
           while(!pq.isEmpty() && pq.peek()<=i-k)
                 pq.removeFirst();
           while(!pq.isEmpty() && nums[i]>=nums[pq.peekLast()])
               pq.removeLast();
           pq.addLast(i);
           
       }
       alist.add(nums[pq.peek()]);
		int arr[]=alist.stream().mapToInt(j->j).toArray();
		return arr;
		
	
       
   }

}
