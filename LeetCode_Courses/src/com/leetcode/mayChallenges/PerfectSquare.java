package com.leetcode.mayChallenges;

public class PerfectSquare {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(2147483647));
		
	}
	
	public static boolean isPerfectSquare(int num) {
		int left=1;
		int right=num;
		
		while(left<=right)
		{
			int mid = right - (right-left)/2;
            if(num%mid==0 && mid==num/mid)
                return true;
            else if(mid<num/mid)
                left = mid+1;
            else
                right = mid-1;
			
		}
		
		return false;
        
		
    }
	
	
	
	

}
