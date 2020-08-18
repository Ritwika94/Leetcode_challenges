package com.leetcode.august.Challenges;

public class DistributeCandiesToPeople {

	public static void main(String[] args) {
		int candies=10;
		int num_people=3;
		System.out.println(distributeCandies(candies,num_people));

	}
	public static int[] distributeCandies(int candies, int num_people) {
        int arr[]=new int[num_people];
      
        int i=0;
        int candy_count=1;
        
        while(candies>0)
        {
            if(candies>=candy_count)
            {
              arr[i]+=candy_count;
              candies=candies-candy_count;
             }
            else
            {
                arr[i]+=candies;
                break;
             }
                
             
            
            candy_count++;
            i=(i+1)%num_people;
            
            
         }
        return arr;
        
    }


}
