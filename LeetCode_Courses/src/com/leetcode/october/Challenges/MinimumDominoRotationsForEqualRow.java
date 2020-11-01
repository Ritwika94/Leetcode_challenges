package com.leetcode.october.Challenges;

import java.util.HashMap;

public class MinimumDominoRotationsForEqualRow {

	public static void main(String[] args) {
		int[] A= {2,1,2,4,2,2};
		int[] B= {5,2,6,2,3,2};
		System.out.println(minDominoRotations(A,B));

	}
	public static int minDominoRotations(int[] A, int[] B) {
        int n=A.length;
        int m=B.length;
        
        if(n!=m)
            return 0;
        HashMap<Integer,Integer> hmap1=new HashMap();
        HashMap<Integer,Integer> hmap2=new HashMap(); 
        int[] same = new int[7];
        
        for(int i=0;i<n;i++){
            hmap1.put(A[i],hmap1.getOrDefault(A[i],0)+1);
            hmap2.put(B[i],hmap2.getOrDefault(B[i],0)+1);
            if(A[i]==B[i])
                ++same[A[i]];
        }
        for(int i=0;i<7;i++){
            if(hmap1.get(i)!=null && hmap2.get(i)!=null && hmap1.get(i)+hmap2.get(i)-same[i]>=n)
                return Math.min(hmap1.get(i),hmap2.get(i))-same[i];
        }
       return -1;
       
     
    }

}
