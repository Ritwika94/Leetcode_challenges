package com.leetcode.november.Challenges;
/**
 * Given a positive integer K, you need to find the length of the smallest positive integer N such that N is divisible by K, and N only contains the digit 1.
 * 
 * @author Ritu
 *
 */
public class SmallestIntegerDivisibleByK {

	public static void main(String[] args) {
	System.out.println(smallestRepunitDivByK(3));
	}
	 public static int smallestRepunitDivByK(int K) {
	        if(K%2==0 || K%5==0)
	            return -1;
	        int n=0;
	        int i=1;
	        for(i=1;i<=K;i++){
	            n=(n*10+1)%K;
	            System.out.println(n);
	            if(n%K==0)
	                return i;
	        }
	       return -1; 
	        
	    }

}
