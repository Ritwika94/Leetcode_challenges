package com.leetcode.december.Challenges;

import java.util.ArrayList;

public class DiagonalTraverse {

	public static void main(String[] args) {
		int[][] mat= {
				  {1, 2, 3 },
				  { 4, 5, 6 },
				  { 7, 8, 9 }
		};
		int arr[]=findDiagonalOrder(mat);
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}
	
	public static int[] findDiagonalOrder(int[][] matrix) {
        int m=matrix.length;
       
      
        if(m==0)
        {
            int arr1[]={};
            return arr1;
        }
         int n=matrix[0].length;
        boolean uP=true;
        int i=0,j=0;
        ArrayList<Integer> alist=new ArrayList();
        for(int k=0;k<m*n;){
           if(uP){
               for(;i>=0 && j<=n-1; j++,i--){
                   alist.add(matrix[i][j]);
                   k++;
               }
               if(i<0 && j<=n-1)
                   i=0;
               if(j==n){
                   i=i+2;
                   j--;
               }
           }
            else{
                 for(;i<m && j>=0; j--,i++){
                   alist.add(matrix[i][j]);
                     k++;
               }
               if(j<0 && i<=m-1)
                  j=0;
               if(i==m){
                  j=j+2;
                  i--;
               }
            }
            uP=!uP;
        }
        
        int arr[]=alist.stream().mapToInt(p->p).toArray();
        return arr;
    }

}
