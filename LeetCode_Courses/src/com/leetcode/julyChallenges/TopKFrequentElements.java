package com.leetcode.julyChallenges;

import java.util.HashMap;

public class TopKFrequentElements {

	public static void main(String[] args) {
		int[] nums= {1,1,1,2,2,3};
		int k=2;
		topKFrequent(nums,k);

	}
	 public static int[] topKFrequent(int[] nums, int k) {
	        int arr[]=new int[k+1];
	        HashMap<Integer,Integer> hmap=new  HashMap<Integer,Integer>();
	        for(int i=0;i<k+1;i++)
	        {
	            hmap.put(i,0);
	        }
	        for(int i=0;i<nums.length;i++)
	        {
	           if(hmap.containsKey(nums[i]))
	               hmap.put(nums[i],hmap.get(nums[i])+1);
	            else
	                    hmap.put(nums[i],1);
	            arr[k]=nums[i];
	            int j=find(arr,nums[i]);
	           
	            j--;
	            while(j>=0)
	            {
	                
	                if(hmap.get(arr[j])<hmap.get(arr[j+1]))
	                {
	                    int temp=arr[j];
	                    arr[j]=arr[j+1];
	                    arr[j+1]=temp;
	                }
	                 else
	                   break;
	              j--;
	                
	         }   
	           
	            
	       }
	        int topkarr[]=new int[k];
	        for(int i=0;i<k;i++)
	        {
	           topkarr[i]=arr[i];
	        }
	       return topkarr;
	     }
	    
	   public static int find(int arr[],int el)
	   {
	        for(int i=0;i<arr.length;i++)
	        {
	           if(arr[i]==el)
	               return i;
	        }
	       return -1;
	  }
}
