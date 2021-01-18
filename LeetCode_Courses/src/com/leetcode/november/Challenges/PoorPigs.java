package com.leetcode.november.Challenges;

public class PoorPigs {

	public static void main(String[] args) {
		System.out.println("Minimum no of pigs:"+poorPigs(1000,15,60));

	}
	 public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
	        if(buckets==0 || buckets==1 || minutesToDie>minutesToTest)
	            return 0;
	        int states=(int)Math.floor(minutesToTest/minutesToDie)+1;
	        int num=1;
	        while(Math.pow(states,num)<buckets){
	             num++;
	        }
	           
	        
	        return num;
	        
	        
	    }

}
