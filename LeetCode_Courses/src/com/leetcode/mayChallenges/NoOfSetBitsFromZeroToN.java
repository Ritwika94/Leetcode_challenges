package com.leetcode.mayChallenges;

public class NoOfSetBitsFromZeroToN {

	public static void main(String[] args) {
		int num=5;
		int arr[]=countBits(num);
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{///
			System.out.print(arr[i]+" ");
		}//
		System.out.print("]");
	}
	
	public static int[] countBits(int num) {
		if (num==0)
        {
           int arr[]=new int[1];
            arr[0]=0;
            return arr;
         }
        if (num==1)
        {
           int arr[]=new int[2];
            arr[0]=0;
            arr[1]=1;
            return arr;
         }
		int setBitCount[]=new int[num+1];
		setBitCount[0]=0;
		setBitCount[1]=1;
		for(int i=2;i<=num;i++)
		{
			if(i%2==0)
				setBitCount[i]=setBitCount[i/2];
			else
				setBitCount[i]=setBitCount[i-1]+1;
		}
		return setBitCount;
		
        
    }	
}
