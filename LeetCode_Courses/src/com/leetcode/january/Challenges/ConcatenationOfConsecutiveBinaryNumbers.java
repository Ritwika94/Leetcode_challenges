package com.leetcode.january.Challenges;

public class ConcatenationOfConsecutiveBinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int concatenatedBinary(int n) {
	     
	        long val=1;
	        for(int i=2;i<=n;i++){
	            val=(((val<<(1+(int)(Math.log(i) / Math.log(2))))%1000000007)+i)%1000000007;
	        }
	        return (int)val;
	    }

}
