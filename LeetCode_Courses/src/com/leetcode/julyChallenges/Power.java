package com.leetcode.julyChallenges;

public class Power {

	public static void main(String[] args) {
		System.out.println(myPow(2.00000, -2));

	}
	 public static double myPow(double x, int n) {
	        double temp=0;
	        if(n==0)
	            return 1;
	        temp=myPow(x,n/2);
	        if(n%2==0) 
	            return temp*temp;
	        else
	        {
	            if(n>0)
	               return x*temp*temp;;
	            
	             return (temp*temp)/x;
	        }
	        
	    }
}
