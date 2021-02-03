package com.leetcode.january.Challenges;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortTheMatrixDiagonally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        HashMap<Integer,PriorityQueue<Integer>> hmap=new HashMap<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                hmap.putIfAbsent(i-j,new PriorityQueue<Integer>());
                hmap.get(i-j).offer(mat[i][j]);
            }
        }
        
          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=hmap.get(i-j).poll();
            }
        }
        
        return mat;
    }

}
