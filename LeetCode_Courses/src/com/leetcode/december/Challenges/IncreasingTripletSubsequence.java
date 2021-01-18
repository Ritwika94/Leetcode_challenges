package com.leetcode.december.Challenges;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		int[] nums= {2,1,5,0,4,6};
		System.out.println(increasingTriplet(nums));

	}
	
	public static boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        
        int smaller[]=new int[n];
         int greater[]=new int[n];
        
        int min=0;
        int max=n-1;
        
        smaller[0]=-1;
        greater[n-1]=-1;
        
        for(int i=1;i<n;i++){
            if(nums[i]>nums[min]){
                smaller[i]=min;
            }
            else{
                 smaller[i]=-1;
                  min=i;
            }
        }
        
          
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[max]){
                greater[i]=max;
            }
            else{
                 greater[i]=-1;
                  max=i;
            }
        }
        
          for(int i=0;i<n;i++){
              if(smaller[i]!=-1 && greater[i]!=-1){
                 
                  return true;
              }
                 
          }
        
        return false;
    }
	

}
