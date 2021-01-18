package com.leetcode.december.Challenges;

import java.util.Stack;

public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		int[] heights= {2,1,5,6,2,3};
		System.out.println(largestRectangleArea(heights));

	}
	public static int largestRectangleArea(int[] heights) {
        if(heights.length==0)
            return 0;
        Stack<Integer> stck=new Stack();
        int top=-1;
        int maxArea=0;
        int area=0;
        int i=0;
        for(i=0;i<heights.length;i++){
            if(stck.isEmpty())
                stck.push(i);
            else{
                while(!stck.isEmpty() && heights[stck.peek()]>heights[i] ){
                        top=stck.pop();
                        if(!stck.isEmpty())
                            area=heights[top]*(i-stck.peek()-1);
                       else{
                        area=heights[top]*i;
                       
                     }
                maxArea=Math.max(maxArea,area);
               } 
                                      

              stck.push(i);
            }
           
        }
        
        while(!stck.isEmpty()){
            top=stck.pop();
            if(!stck.isEmpty())
                area=heights[top]*(i-stck.peek()-1);
            else
                  area=heights[top]*i;
              maxArea=Math.max(maxArea,area);     
        }
      return maxArea;  
    }

}
