package com.leetcode.mayChallenges;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanner {
	
	 public ArrayList<Integer> stckprice;
	 public Stack<Integer> countarr;
	 public int count;

	public StockSpanner() {
		stckprice=new ArrayList<Integer>();
		countarr=new Stack<Integer>();
	        
	    }
	    
	    public int next(int price) {
	    	count++;
	    	while(!countarr.isEmpty() && price>=stckprice.get(countarr.peek()-1))
	    		countarr.pop();
	    	int value=(countarr.isEmpty())?count:count-countarr.peek();
	    	stckprice.add(price);
	    	countarr.push(count);
	    	return value;
	    	
	   }
	

	public static void main(String[] args) {
		
	}

}
