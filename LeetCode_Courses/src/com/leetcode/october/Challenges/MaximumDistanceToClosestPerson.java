package com.leetcode.october.Challenges;

public class MaximumDistanceToClosestPerson {

	public static void main(String[] args) {
		int[] seats= {1,0,0,0,1,0,1};
		System.out.println(maxDistToClosest(seats));

	}
	public static int maxDistToClosest(int[] seats) {
        int n=seats.length;
        int arr1[]=new int[n];
         int arr2[]=new int[n];
        
        int index=-1;
        for(int i=0;i<n;i++){
            if(seats[i]==1){
                arr1[i]=Integer.MIN_VALUE;
                index=i;
            }
            else{
                if(index!=-1){
                     arr1[i]=i-index;
                }
                else
                    arr1[i]=Integer.MIN_VALUE;
               
            }
        }
        index=-1;
        for(int i=n-1;i>=0;i--){
            if(seats[i]==1){
                arr2[i]=Integer.MIN_VALUE;
                index=i;
            }
            else{
                if(index!=-1){
                     arr2[i]=index-i;
                }
                else
                    arr2[i]=Integer.MIN_VALUE;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            System.out.println(arr1[i]+" "+arr2[i]);
            if(seats[i]!=1 && arr1[i]!=Integer.MIN_VALUE&& arr2[i]!=Integer.MIN_VALUE){
                 int x=Math.min(arr1[i],arr2[i]);
                System.out.println(Math.max(max,x));

                 max=Math.max(max,x);
            }
            else if(seats[i]!=1 && arr1[i]!=Integer.MIN_VALUE){
                
                 max=Math.max(max,arr1[i]);
            }
            else if(seats[i]!=1 && arr2[i]!=Integer.MIN_VALUE){
                
                 max=Math.max(max,arr2[i]);
            }
            System.out.println(max);
           
        }
      return max;  
    }

}
