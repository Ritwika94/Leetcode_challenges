package com.leetcode.january.Challenges;

import java.util.HashMap;

public class MinimumOperationsToReduceXToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int minOperations(int[] nums, int x) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int s=0;
        int ans=Integer.MAX_VALUE;
        int r=nums.length;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(s==x){
               ans=Math.min(ans,i+1);
                break;
            }
             
            if(s>x)
                break;
            hmap.put(s,i+1);
        }
        
        s=0;
        for(int i=r-1;i>=0;i--){
            s+=nums[i];
            System.out.println(s);
            if(s==x){
             
                 ans= Math.min(ans,(r-i));
            }
               
            if(hmap.containsKey(x-s)){
                if(hmap.get(x-s)<i) 
                    ans=Math.min(ans,hmap.get(x-s)+(r-i));
                
            }
            if(s>x)
                break;
        }
        if(ans==Integer.MAX_VALUE)
            return -1;
        return ans;
    }

}
