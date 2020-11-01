package com.leetcode.septemberChallenges;

public class GasStation {

	public static void main(String[] args) {
		int[] gas= {1,2,3,4,5};
		int[] cost= {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas,cost));

	}
	 public static int canCompleteCircuit(int[] gas, int[] cost) {
	     int n=gas.length;
	      int curr=0;
	      int diff[]=new int[n];
	     
	          for(int i=0,j=0;i<n && j<n;i++,j++){
	              diff[i]=gas[i]-cost[i];
	          }
	      
	     
	        for(int i=0;i<n;i++){
	            curr=0;
	            if(diff[i]<0)
	                continue;
	            else{
	                int k=(i+1)%n;
	                curr=diff[i];
	                while(k!=i){
	                    curr+=diff[k];
	                    if(curr<0)
	                        break;
	                    k=(k+1)%n;
	                }
	              
	                if(curr>=0)
	                    return i;
	                
	            }
	        }
	       return -1;
	        
	    }

}
