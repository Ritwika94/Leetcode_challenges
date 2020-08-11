package com.leetcode.julyChallenges;

public class ReversingBits {

	public static void main(String[] args) {
		System.out.println(reverseBits(14));

	}
	public static int reverseBits(int n) {
        int res=0;
		 for (int i = 0; i < 32; i++) {
				res<<=1;
				res+=n%2;
			    n>>>=1;
			}
		 
			return res;
        
    }
	 
		
}