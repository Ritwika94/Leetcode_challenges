package com.leetcode.december.Challenges;

import java.util.ArrayList;

public class MissingRanges {

	public static void main(String[] args) {
		int[] nums= {0,1,3,50,75};
		int l=0;
		int h=99;
		ArrayList<String> ranges=missingRanges(nums,l,h);
		for(String str:ranges)
			System.out.println(str+" ");

	}
	public static ArrayList<String> missingRanges(int []nums, int l, int h){
		ArrayList<String> ranges=new ArrayList();
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>l) {
				if(nums[i]-l==1) {
					ranges.add(l+"");
				}
				else {
					ranges.add(l+"->"+(nums[i]-1));
				}
			}
			if(nums[i]==Integer.MAX_VALUE)
				return ranges;
			l=nums[i]+1;
		}
		if(l<h) {
			ranges.add(l+"->"+(h));
		}
		else if(l==h) {
			ranges.add(l+" ");
		}
		return ranges;
	}


}
