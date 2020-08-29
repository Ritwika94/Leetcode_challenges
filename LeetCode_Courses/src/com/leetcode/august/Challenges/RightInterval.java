package com.leetcode.august.Challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RightInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] findRightInterval(int[][] intervals) {
        if(intervals.length==1)
        {
             int res[]={-1};
              return res;
         }
        int n=intervals.length;
        ArrayList<Integer> alist=new ArrayList();
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<n;i++)
        {
            int x=intervals[i][0];
            int y=intervals[i][1];
            map.put(x,i);
            alist.add(x);
         }
         Collections.sort(alist);
        
        int res[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
             int end=intervals[i][1];
            int start=binarySearch(alist,end);
            if(start<end)
                res[i]=-1;
            else
                res[i]=map.get(start);
            
         }
        return res;
    }
    public int binarySearch(List<Integer> list, int x) {
    int left = 0, right = list.size() - 1;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (list.get(mid) < x) { 
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return list.get(left);
}

}
