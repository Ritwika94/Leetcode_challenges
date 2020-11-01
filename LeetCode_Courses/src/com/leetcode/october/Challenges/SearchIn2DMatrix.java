package com.leetcode.october.Challenges;

public class SearchIn2DMatrix {

	public static void main(String[] args) {
		int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		int target=3;
		System.out.println(searchMatrix(matrix,target));

	}
	   public static boolean searchMatrix(int[][] matrix, int target) {
	        
	        int n=matrix.length;
	          if(n==0)
	            return false;
	        int m=matrix[0].length;
	      
	        int i=0;
	        int j=m-1;
	        
	        while(i<n && j>=0){
	            if(matrix[i][j]==target)
	                return true;
	              else if(matrix[i][j]<target)
	                 i++;
	             else if(matrix[i][j]>target)
	                 j--;
	            
	            
	        }
	        return false;
	        
	    }

}
