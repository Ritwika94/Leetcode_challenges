package com.leetcode.mayChallenges;

public class IntegerComplement {

	public static void main(String[] args) {
		System.out.println(findComplement(18));

	}
	
	public static int findComplement(int num) {
		
		int no_of_digits=(int)(Math.floor(Math.log(num)/ Math.log(2))+1);
		
		return ((1<<no_of_digits)-1)^num;
        
    }

}
