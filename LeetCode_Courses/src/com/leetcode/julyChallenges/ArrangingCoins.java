package com.leetcode.julyChallenges;

public class ArrangingCoins {

	public static void main(String[] args) {
		System.out.println(arrangeCoins(8));

	}
	public static int arrangeCoins(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int k=1;
        int count=0;
        while(n>0)
        {
            n=n-k;
            k++;
            if(n>=0)
                count++;
           
            
        }
        return count;
    }

}
