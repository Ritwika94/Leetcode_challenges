package com.leetcode.julyChallenges;

public class UglyNumber {

	public static void main(String[] args) {
		System.out.println(nthUglyNumber(12));

	}
	 public static int nthUglyNumber(int n) {
	        int arr[]=new int[n];
	        int count2=0;
	        int count3=0;
	        int count5=0;
	        int seq2=2;
	        int seq3=3;
	        int seq5=5;
	        arr[0]=1;
	        for(int i=1;i<n;i++)
	        {
	            int next_num=Math.min(seq2, Math.min(seq3,seq5));
	            arr[i]=next_num;
	            if(next_num==seq2)
	            {
	                count2+=1;
	                seq2=arr[count2]*2;
	            }
	            if(next_num==seq3)
	            {
	                count3+=1;
	                seq3=arr[count3]*3;
	            }
	            if(next_num==seq5)
	            {
	                count5+=1;
	                seq5=arr[count5]*5;
	            }
	                    
	        }
	        
	        return arr[n-1];
	        
	        
	        
	    }
}
