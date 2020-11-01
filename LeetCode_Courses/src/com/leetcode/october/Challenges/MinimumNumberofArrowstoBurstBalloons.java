package com.leetcode.october.Challenges;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons {

	public static void main(String[] args) {
		int[][] points= {{10,16},{2,8},{1,6},{7,12}};
		System.out.println(findMinArrowShots(points));

	}
	 public static int findMinArrowShots(int[][] points) {
	        if(points.length==0)
	            return 0;
	        Arrays.sort(points,(a,b)->a[0]-b[0]);
	        int n=points.length;
	       ArrayList<Integer> alist=new ArrayList();
	        int pos=points[n-1][0];
	        
	        
	        for(int i=n-1;i>=0;i--){
	            if(points[i][0]<=pos &&  pos<=points[i][1]){
	              
	                continue;
	            }
	               
	            
	            else{
	                
	               alist.add(pos);
	               
	                pos=points[i][0];
	            }
	        }
	         
	        alist.add(pos);
	       
	        return alist.size();
	        
	        
	    }
}
