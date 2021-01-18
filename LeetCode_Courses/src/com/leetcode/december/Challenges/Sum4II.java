package com.leetcode.december.Challenges;

import java.util.HashMap;

public class Sum4II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
	        HashMap<Integer,Integer> hmap1=new HashMap();
	        int n=A.length;
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                hmap1.put(A[i]+B[j],hmap1.getOrDefault(A[i]+B[j],0)+1);
	            }
	        }  
	        int res=0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	              res+=hmap1.getOrDefault(-1*(C[i]+D[j]),0);
	            }
	        }
	        
	      return res;    
	       
	        
	    }

}
