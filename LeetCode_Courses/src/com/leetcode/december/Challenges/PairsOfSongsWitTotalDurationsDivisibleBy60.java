package com.leetcode.december.Challenges;

public class PairsOfSongsWitTotalDurationsDivisibleBy60 {

	public static void main(String[] args) {
		int[] time= {30,20,150,100,40};
		System.out.println(numPairsDivisibleBy60(time));

	}
	public static int numPairsDivisibleBy60(int[] time) {
        int n=time.length;
        int arr[]=new int[60];
        int count=0;
        for(int i=0;i<n;i++){
           int x=time[i]%60;
           count+=(x==0)?arr[0]:arr[60-x];
           arr[x]++;
         }
    
    
        return count;
    }

}
