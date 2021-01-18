package com.leetcode.january.Challenges;

import java.util.Arrays;

public class GetMaximumInGeneratedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int getMaximumGenerated(int n) {
	        if(n==0)
	            return 0;
	        if(n==1)
	            return 1;
	        
	        int arr[]=new int[n+1];
	        Arrays.fill(arr,0);
	        arr[0]=1;
	        arr[1]=1;
	        int i=1;
	        int p=0;
	        while(p<=n){
	            p=2*i;
	            if(p<=n)
	                arr[p]=arr[i];
	            
	            p=2*i+1;
	            if(p<=n)
	                arr[p]=arr[i]+arr[i+1];
	            i++;
	            
	        }
	      
	        int max=Integer.MIN_VALUE;
	        
	        for(int x:arr)
	            max=Math.max(max,x);
	        
	        return max;
	        
	    }

}
