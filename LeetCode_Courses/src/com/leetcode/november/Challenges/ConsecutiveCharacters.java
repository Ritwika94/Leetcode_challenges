package com.leetcode.november.Challenges;

import java.util.Arrays;

public class ConsecutiveCharacters {

	public static void main(String[] args) {
		System.out.println(maxPower("abbcccddddeeeeedcba"));

	}
	 public static int maxPower(String s) {
	        int n=s.length();
	        int power[]=new int[n];
	        Arrays.fill(power,1);
	        for(int i=1;i<n;i++){
	            for(int j=i-1;j>=0;j--){
	                if(s.charAt(i)==s.charAt(j)){
	                    power[i]+=1;
	                }
	                else
	                    break;
	            }
	        }
	        int max=Integer.MIN_VALUE;
	        for(int x:power){
	            max=Math.max(max,x);
	        }
	        return max;
	    }

}
