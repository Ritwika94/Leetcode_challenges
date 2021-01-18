package com.leetcode.january.Challenges;

import java.util.HashMap;

public class CheckArrayFormationThroughConcatenation {

	public static void main(String[] args) {
		int[] arr= {91,4,64,78};
		int[][] pieces= {{78},{4,64},{91}};
		System.out.println(canFormArray(arr,pieces));

	}
	
	 public static boolean canFormArray(int[] arr, int[][] pieces) {
	        HashMap<Integer, Integer> hmap=new HashMap();
	        
	        for(int i=0;i<arr.length;i++)
	            hmap.put(arr[i],i);
	        
	        for(int i=0;i<pieces.length;i++){
	            if(pieces[i].length==1 && hmap.containsKey(pieces[i][0]))
	                    continue;
	            
	               else if(pieces[i].length>1 && hmap.containsKey(pieces[i][0])){
	                   
	                   int index=hmap.get(pieces[i][0]);
	                   index++;
	                   if(index>=arr.length)
	                       return false;
	                   for(int j=1;j<pieces[i].length;j++){
	                       if(arr[index]==(pieces[i][j])){
	                           index++;
	                        if(index>=arr.length && j<pieces[i].length-1)
	                            return false;
	                       }
	                    else
	                          return false;
	                   }
	               }
	            else
	                          return false;
	        }
	                          
	        return true;
	    }

}
