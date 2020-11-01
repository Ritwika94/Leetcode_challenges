package com.leetcode.septemberChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
    
	public static void main(String[] args) {
		//int[][] intervals= {{1,2},{3,5},{6,7},{8,10},{12,16}};
		//int[] newInterval= {4,8};
		int[][] intervals= {{1,3},{6,9}};
		int[] newInterval= {2,5};
		int arr[][]=insert(intervals,newInterval);
		 for (int[] interval : arr) {
			 System.out.println("["+interval[0]+","+interval[1]+"]");
		 }
	}
	
public static int[][] insert(int[][] intervals, int[] newInterval) {
	List<int[]> alist=new ArrayList();
	 for (int[] interval : intervals) {
         int start = interval[0];
         int end = interval[1];
         alist.add(new int[] {start, end});
     }
	 alist.add(newInterval);
	 Collections.sort(alist,new Comparator<int[]>() {
         @Override
         public int compare(int[] a, int[] b) {
             return a[0] - b[0];
         }
     });
	 int start=alist.get(0)[0];
	 int end=alist.get(0)[1];
	 List<int[]> alist2=new ArrayList();
	 for (int[] interval : alist) {
         int start1 = interval[0];
         int end1 = interval[1];
         if(start1>=start && end1<=end)
        	 continue;
         if(start1>end) {
        	 alist2.add(new int[] {start,end});
        	 start=start1;
        	 end=end1;
         }
         
         if(start1>start && end1>end)
        	 end=end1;
         
     }
	 alist2.add(new int[] {start,end});
	int [][]arr2=new int[alist2.size()][2];
	int i=0;
	 for (int[] interval : alist2) {
          arr2[i][0] = interval[0];
          arr2[i][1] = interval[1];
          i++;
     }
	 return arr2;
        
    }

}
