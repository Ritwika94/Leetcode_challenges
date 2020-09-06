package com.leetcode.septemberChallenges;

public class ImageOverlap {

	public static void main(String[] args) {
		int[][] A= {{1,1,0},
	            {0,1,0},
	            {0,1,0}};
		int[][] B= {{0,0,0},
	            {0,1,1},
	            {0,0,1}};
		System.out.println(largestOverlap(A,B));

	}
	public static int largestOverlap(int[][] A, int[][] B) {
        int largestOverlap=0;
        for(int i=-A.length+1;i<A.length;i++){
               for(int j=-A.length+1;j<A.length;j++){
                 largestOverlap=Math.max(largestOverlap,overLapMatrices(A,B,i,j));
          }
        }
       return  largestOverlap;
    }
        
     public static int overLapMatrices(int[][] A, int[][] B, int row,int col) {
         int count=0;
          for(int i=0;i<A.length;i++){
               for(int j=0;j<A[0].length;j++){
                if(((i+row)<0 || (i+row)>=A.length)  || ((j+col)<0 || (j+col)>=A.length))
                    continue;
                   
                if(A[i][j]+B[i+row][j+col]==2)
                    count++;
          }
        }
       return count;  
     }

}
