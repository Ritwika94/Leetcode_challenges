package com.leetcode.november.Challenges;

public class LongestMountainInArray {

	public static void main(String[] args) {
		int[] A= {2,1,4,7,3,2,5};
		System.out.println("Longest Mountain:"+longestMountain(A));

	}
	public static int longestMountain(int[] A) {
        int start=-1;
        int i=1;
        int len=Integer.MIN_VALUE;
       while(i<A.length){
           // System.out.println("hi");
            if(A[i]>=A[i-1]){
                if(start==-1){
                    
                    start=0;
                }
                if(A[i]==A[i-1])
                    start=i;

                i++;
                continue;
            }
                
         //System.out.println(i);
           int ind=i;
           if(i-1!=0 &&start!=i-1){
           int temp=A[i-1];
           
            while(i<A.length-1){
             if(A[i]<=A[i+1])
                 break;
                i++;
            }
            if(start!=-1){
                System.out.println(i);
                 System.out.println(start);
                len=Math.max(len,i-start+1);
            }
           }
           
            start=i;
            i++;
            
        }
        if(len!=Integer.MIN_VALUE)
            return len;
        return 0;
    }

}
