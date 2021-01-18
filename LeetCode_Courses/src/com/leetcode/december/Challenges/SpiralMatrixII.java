package com.leetcode.december.Challenges;

public class SpiralMatrixII {

	public static void main(String[] args) {
		int n=3;
		generateMatrix(n);

	}
	public static int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        
        int val=0;
        int l=0;
        int k=0;
        int r=n;
        int c=n;
        while(k<r && l<c){
        for(int i=l;i<c;i++){
            arr[k][i]=++val;
        }
        k++;
        for(int i=k;i<r;i++){
             arr[i][c-1]=++val;
        }
        c--;
        if(k<r){
        for(int i=c-1;i>=l;i--){
            arr[r-1][i]=++val;
            }
            r--;
        }
        if(l<c){
        for(int i=r-1;i>=k;i--){
            arr[i][l]=++val;
            }
           l++;
        }
        }
       
       return arr; 
    }

}
