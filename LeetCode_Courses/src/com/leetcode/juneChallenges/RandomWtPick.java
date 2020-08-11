package com.leetcode.juneChallenges;

public class RandomWtPick {
	 public  int[] w={};
	    public RandomWtPick(int[] w) {
	        this.w=w;
	    }
	    
	    public int pickIndex() {
	        int w[]=this.w;
	        int n=w.length;
	        int[] prefix=new int[w.length];
	        prefix[0]=w[0];
	        for(int i=1;i<n;i++)
	        {
	            prefix[i]=w[i]+prefix[i-1];
	        }
	        int r=((int)(Math.random()*(323567))%prefix[n-1])+1;
	        int index=findCeil(prefix,r,0,n-1);
	        return index;
	        
	    }
	    
	    public int findCeil(int arr[],int r,int l,int h)
	    {
	        int mid;
	        while(l<h)
	        {
	            mid=l+(h-l)/2;
	            if(r>arr[mid])
	                l=mid+1;
	            else
	                h=mid;
	         }
	        return (arr[l]>=r)?l:-1;
	     }

}
