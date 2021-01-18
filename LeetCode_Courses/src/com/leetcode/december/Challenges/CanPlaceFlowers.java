package com.leetcode.december.Challenges;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		int[] flowerbed= {1,0,0,0,1};
		int n=2;
		System.out.println(canPlaceFlowers(flowerbed,n));

	}
	
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	        if(flowerbed.length==0 )
	            return false;
	          if(n==0)
	            return true;
	         if(flowerbed.length==1 && flowerbed[0]==0 &&n==1)
	            return true;
	        if(flowerbed.length==1 && flowerbed[0]==0 &&n>1)
	            return false;
	          if(flowerbed.length==1 && flowerbed[0]==1 &&n==1)
	            return false;
	        if(flowerbed.length==1 && flowerbed[0]==0 &&n>1)
	            return false;
	        int k=0;
	        if(flowerbed[0]==0 && flowerbed[1]!=1 ){
	            flowerbed[0]=1;
	            k++;
	           
	        }
	        if(k==n)
	            return true;
	        for(int i=1;i<flowerbed.length-1;i++){
	            if(flowerbed[i-1]!=1 &&flowerbed[i]==0 && flowerbed[i+1]!=1 ){ 
	                k++;
	                if(k==n)
	                     return true;
	                flowerbed[i]=1;
	            }
	        }
	        if(flowerbed[flowerbed.length-2]==0 && flowerbed[flowerbed.length-1]==0){
	            flowerbed[flowerbed.length-1]=1;
	            k++;
	        }
	        if(k==n)
	            return true;
	        return false;
	    }

}
