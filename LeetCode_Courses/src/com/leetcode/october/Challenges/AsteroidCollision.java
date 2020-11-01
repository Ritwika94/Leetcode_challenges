package com.leetcode.october.Challenges;

import java.util.Stack;

public class AsteroidCollision {
	
	public static void main(String[] args) {
		int[] asteroids= {5,10,-5};
		int arr[]=asteroidCollision(asteroids);
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
		int[] asteroids1= {-2,-1,1,2};
		int arr1[]=asteroidCollision(asteroids1);
		for(int x:arr1)
			System.out.print(x+" ");

	}
	 public static int[] asteroidCollision(int[] asteroids) {
	        Stack<Integer> stck=new Stack<>();
	        for(int x:asteroids){
	            if(x<0){
	                
	                 int p=0;   
	                while(!stck.isEmpty() && stck.peek()>0 && stck.peek()<=Math.abs(x)){
	                     p=stck.pop();
	                    if(p==Math.abs(x))
	                        break;
	                
	                }
	                 if(p==Math.abs(x))
	                        continue;
	                if(stck.isEmpty()){
	                    stck.push(x);
	                    continue;
	                }
	                
	              if(!stck.isEmpty() && stck.peek()<0)
	                  stck.push(x);
	            }
	            else{
	              
	                  stck.push(x);
	            }
	              
	            
	        }
	        int arr[]= new int[stck.size()];
	        for(int i=arr.length-1;i>=0;i--)
	            arr[i]=stck.pop();
	      return arr;
	    }

}
