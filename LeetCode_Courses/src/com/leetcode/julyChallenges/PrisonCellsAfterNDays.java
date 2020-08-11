package com.leetcode.julyChallenges;

import java.util.Arrays;

public class PrisonCellsAfterNDays {

	public static void main(String[] args) {
		int[] cells= {0,1,0,1,1,0,0,1};
		int N=7;
		int arr[]=prisonAfterNDays(cells,N);
		 for(int i=0; i<arr.length; i++)
		 {
			 System.out.print(arr[i]+" ");
		 }

	}
	public static int[] prisonAfterNDays(int[] cells, int N) {
	      
        int cycle =1;
        int first[] = new int[8];

        for(int i=1; i<7; i++)
        {
            first[i] = (cells[i-1] == cells[i+1] ? 1 :0);
        }
        N-=1;
        
        for(int i=0; i<8; i++)
        cells[i] = first[i];
        
    
        while(N-->0)
        {
        
            int temp [] = new int [8];    
     
        for(int i=1; i<7; i++)
        {
            temp[i] = (cells[i-1] == cells[i+1] ? 1 :0);
        }
      
            if(Arrays.equals(temp, first)) 
                N%=cycle;
     
               for(int i=0; i<8; i++)
               cells[i] = temp[i];   
       
            cycle++;
        }
        
        return cells;
        
        
    }
}
