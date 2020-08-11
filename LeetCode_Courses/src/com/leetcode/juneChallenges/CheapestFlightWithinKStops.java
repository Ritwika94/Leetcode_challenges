package com.leetcode.juneChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class CheapestFlightWithinKStops {

	public static void main(String[] args) {
		int n=10;
		int[][] flights= {{3,4,4},{2,5,6},{4,7,10},{9,6,5},{7,4,4},{6,2,10},{6,8,6},{7,9,4},{1,5,4},{1,0,4},{9,7,3},{7,0,5},{6,5,8},{1,7,6},{4,0,9},{5,9,1},{8,7,3},{1,2,6},{4,1,5},{5,2,4},{1,9,1},{7,8,10},{0,4,2},{7,2,8}};
		
		int src=6;
		int dst=0;
		int K=7;
		System.out.println(findCheapestPrice(n, flights, src, dst, K));

	}
	 public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
		 Map<Integer, List<int[]>> adjList = new HashMap();

	        for (int[] flight : flights) {
	            int fromCity = flight[0];
	            int toCity = flight[1];
	            int price = flight[2];
	            adjList.putIfAbsent(fromCity, new ArrayList());
	            adjList.get(fromCity).add(new int[] {toCity, price});
	        }


	        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>(new Comparator<int[]>() {
	           @Override
	            public int compare(int[] a, int[] b) {
	                return a[2] - b[2];
	            }
	        });
	        minHeap.add(new int[] {src, 0, 0});

	        while (!minHeap.isEmpty()) {
	            int[] curInfo = minHeap.remove();
	            int curStop = curInfo[0];
	           
	            int stops = curInfo[1];
	            int curCost = curInfo[2];

	            if (curStop == dst) {
	                return curCost;
	            }

	          
	            if (stops <= K && adjList.containsKey(curStop)) {
	                for (int[] nextInfo : adjList.get(curStop)) {
	                    int nextStop = nextInfo[0];
	                    int price = nextInfo[1];
	                    minHeap.add(new int[] {nextStop, stops + 1, curCost + price});
	                }
	            }

	        }
	        return -1;
	        
	    }
}
