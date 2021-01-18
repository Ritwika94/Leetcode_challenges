package com.leetcode.november.Challenges;

public class FlippingAnImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[][] flipAndInvertImage(int[][] A) {
	        int r=A.length;
	        for(int i=0;i<r;i++){
	           int c=A[i].length;
	            for(int j=0;j<c/2;j++){
	                int temp=A[i][j];
	                A[i][j]=A[i][c-1-j];
	                A[i][c-1-j]=temp;
	            }
	            
	        }
	         for(int i=0;i<r;i++){
	           int c=A[i].length;
	            for(int j=0;j<c;j++){
	               A[i][j]= A[i][j]==0?1:0;
	            }
	            
	        }
	        return A;
	    }

}
