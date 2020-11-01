package com.leetcode.septemberChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {
	 static List<Integer>  alist=new ArrayList();
	public static void main(String[] args) {
		int low=1000;
		int high=13000;
		sequentialDigits(low,high);
		for(int val:alist)
			System.out.println(val);
	}
	 public static List<Integer> sequentialDigits(int low, int high) {
		for(int i=1;i<=9;i++) {
			dfs(i,low,high);
		}
		Collections.sort(alist);
		return alist;
		 
	 }
	private static void dfs(int curr, int low, int high) {
		if(curr>=low && curr<=high) {
			alist.add(curr);
		}
		if (curr > high) return;
        int x = curr % 10;
		
		if(x<9) {
			dfs(curr*10+x+1,low,high);
		}
	}
	
	
}
