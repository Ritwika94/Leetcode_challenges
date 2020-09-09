package com.leetcode.septemberChallenges;

import java.util.Deque;
import java.util.LinkedList;

public class MovingAverageFromDataStream {
   static Deque<Integer> deque;
   static int sizeLimit;
   static double sum;
   public MovingAverageFromDataStream(int sizeLimit) {
		
		this.sizeLimit = sizeLimit;
		deque=new LinkedList<Integer>();
		sum=0.0;
	}
   public static double next(int val) {
	   if(deque.size()==sizeLimit)
		   sum-=deque.removeFirst();
	   sum+=val;
	   deque.add(val);
	   
	return sum/deque.size();
	   
   }
	public static void main(String[] args) {
		MovingAverageFromDataStream md=new MovingAverageFromDataStream(3);
	  System.out.println(md.next(1));
	  System.out.println(md.next(10));
	  System.out.println(md.next(3));
	  System.out.println(md.next(5));
	}

}
