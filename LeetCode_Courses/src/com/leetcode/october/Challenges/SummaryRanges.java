package com.leetcode.october.Challenges;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		int[] nums= {0,1,2,4,5,7};
		summaryRanges(nums);

	}
	public static List<String> summaryRanges(int[] nums) {
        List<String>  alist=new ArrayList();
        int n=nums.length;
        if(nums.length==0)
            return alist;
        if(nums.length==1)
        {
            alist.add(nums[0]+"");
        }
        int prev=nums[0];
        int start=prev;
        for(int i=1;i<n;i++){
            if(nums[i]==prev+1){
                if(i==n-1){
                    alist.add(start+"->"+nums[i]);
                }
            }
            else{
                if(start==prev)
                     alist.add(start+"");
                else
                     alist.add(start+"->"+prev);
                if(i==n-1){
                    alist.add(nums[i]+"");
                }
                start=nums[i];
            }
            prev=nums[i];
        }
        return alist;
        
    }

}
