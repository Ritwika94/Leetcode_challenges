package com.leetcode.septemberChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class CarPooling {

	public static void main(String[] args) {
		int[][] trips= {{5,4,7},{7,4,8},{4,1,8}};
		int capacity=17;
		System.out.println(carPooling(trips,capacity));

	}
	 public static boolean carPooling(int[][] trips, int capacity) {
		 Arrays.sort(trips,(a,b)->a[1]-b[1]);
	   
	    int idx = 0;
	    int n = trips.length;
	    int currCapacity = 0;
	    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
	    while (idx < n) {
	      while (!pq.isEmpty() && pq.peek()[2] <= trips[idx][1]) {
	        currCapacity -= pq.poll()[0];
	      }
	      if (currCapacity + trips[idx][0] > capacity) {
	        return false;
	      }
	      currCapacity += trips[idx][0];
	      pq.add(trips[idx++]);
	    }
	    return true;
	    }

}
