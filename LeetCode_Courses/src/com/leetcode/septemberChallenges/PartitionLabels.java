package com.leetcode.septemberChallenges;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<Integer> partitionLabels(String S) {
	        LinkedHashMap<Character, int[]> map=new LinkedHashMap();
	        for(int i=0;i<S.length();i++){
	            char c=S.charAt(i);
	            int range[]=map.getOrDefault(c,new int[]{-1,-1});
	            if(range[0]==-1){
	                range[0]=i;
	                range[1]=i;
	            }
	            else
	                range[1]=i;
	            
	            map.put(c,range);
	          }
	        
	         int[] temp = null;
	         List<Integer> result = new ArrayList<>();
	        for (Map.Entry<Character, int[]> entry : map.entrySet()){
	            int curr[]=entry.getValue();
	            if(temp==null){
	                temp=curr;
	            }
	            else{
	                if(temp[1]>curr[0]){
	                    temp=new int[]{temp[0],Math.max(temp[1],curr[1])};
	                }
	                else{
	                    result.add(temp[1] - temp[0] + 1);
	                    temp=curr;
	                }
	                    
	            }
	        }
	        result.add(temp[1] - temp[0] + 1);
	        return result;
	    }

}
