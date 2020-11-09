package com.leetcode.november.Challenges;

public class MinimumCostToMoveChipsToTheSamePosition {

	public static void main(String[] args) {
		int[] position= {2,2,2,3,3};
		System.out.println(minCostToMoveChips(position));

	}
	 public static int minCostToMoveChips(int[] position) {
	        int count=0;
	        for(int x:position){
	            if(x%2==1)
	                count++;
	        }
	       return Math.min(count,position.length-count);
	    }

}
