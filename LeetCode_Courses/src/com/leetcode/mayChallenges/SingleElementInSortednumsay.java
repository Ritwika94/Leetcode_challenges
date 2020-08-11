package com.leetcode.mayChallenges;

public class SingleElementInSortednumsay {

	public static void main(String[] args) {
		int nums[]= {3,3,7,7,10,11,11};
		System.out.println(singleNonDuplicate(nums));

	}

	
	
	public static int singleNonDuplicate(int[] nums) {
		if(nums.length==1)
			return nums[0];
		int left=0;
		int right=nums.length-1;
		return search(nums,left,right);
		
        
    }



	public static int search(int[] nums, int low, int high) {
		if(low > high) 
            return 0 ; 
        if(low == high) 
        { 
        
           return nums[low] ;
            
        } 
          
        int mid = (low + high)/2; 
         if(mid % 2 == 0) 
        { 
            if(nums[mid] == nums[mid+1]) 
                return search(nums, mid+2, high); 
            else
                return search(nums, low, mid); 
        } 
        // If mid is odd 
        else if(mid % 2 == 1) 
        { 
            if(nums[mid] == nums[mid-1]) 
                return search(nums, mid+1, high); 
            else
                return search(nums, low, mid-1); 
        }
		return -1;
		
				
	
	}

}
