package com.leetcode.october.Challenges;

public class ComplementOfBase10Integer {

	public static void main(String[] args) {
		int N=5;
		System.out.println(bitwiseComplement(N));

	}
	 public static int bitwiseComplement(int N) {
	        int n=(int)Math.floor((Math.log(N)/Math.log(2)))+1;
	        
	        return (((1<<n)-1)^N);
	        
	    }

}
