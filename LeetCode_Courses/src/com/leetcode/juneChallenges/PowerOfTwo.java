package com.leetcode.juneChallenges;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPowerOfTwo(int n) {
        
        return (n!=0) &&  (n>0) && ((n&(n-1))==0) ;
        
    }

}
