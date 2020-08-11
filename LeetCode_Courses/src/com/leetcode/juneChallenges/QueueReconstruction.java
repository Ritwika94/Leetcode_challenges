package com.leetcode.juneChallenges;

import java.util.Arrays;

public class QueueReconstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[][] reconstructQueue(int[][] people) {
	        Arrays.sort(people,(a,b)->
	                    {
	                        return (a[0]-b[0]);
	                   });
	     
	        int n=people.length;
	        int arr[][]=new int[n][2];
	        for(int k=0;k<arr.length;k++)
	        {
	            arr[k][0]=-1;
	             arr[k][1]=-1;
	            
	         }
	        for(int i=0;i<people.length;i++)
	        {
	           
	          if(people[i][1]==0)
	          {
	              
	              for(int k=0;k<arr.length;k++)
	              {
	                  if(arr[k][0]==-1 && arr[k][1]==-1)
	                  {
	                      arr[k]=people[i];
	                      break;
	                    }
	                     
	               }
	          }
	            else
	            {
	                
	                int pos=findsearchpos(arr,people,i);
	               
	                for(int j=pos;j<arr.length;j++)
	                {
	                  
	                  if(arr[j][0]==-1 && arr[j][1]==-1)
	                   {
	                      
	                     arr[j]=people[i];
	                     break;
	                 }
	                
	                }
	        }
	          
	        }
	        return arr;
	        
	    }
	    public int findsearchpos(int[][] arr, int[][]people,int i) 
	    {
	        int count=0;
	        int gap=people[i][1];
	        
	        for(int j=0;j<arr.length;j++)
	        {
	            if(arr[j][0]==people[i][0] || (arr[j][0]==-1 && arr[j][1]==-1))
	                count++;
	            if(count==gap)
	                return j+1;
	            
	         }
	        return -1;
	     }

}
