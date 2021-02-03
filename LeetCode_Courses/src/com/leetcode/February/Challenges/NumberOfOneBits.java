package com.leetcode.February.Challenges;

public class NumberOfOneBits {

	public static void main(String[] args) {
		
	}
	   // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count=0;
    
        while(n!=0){
           
            if((n & 1)>0){
                 count++;
            }
               
            n=n>>>1;//right shift for unsigned integers
        }
        return count;
    }

}
