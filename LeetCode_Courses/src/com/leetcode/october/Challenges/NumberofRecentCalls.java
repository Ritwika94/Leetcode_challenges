package com.leetcode.october.Challenges;

import java.util.Deque;
import java.util.LinkedList;

public class NumberofRecentCalls {
	Deque<Integer> queue;
	  
    public NumberofRecentCalls() {
      
       this.queue=new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t); 
        while( t-queue.peek()>3000)
            queue.removeFirst(); 
        
        return queue.size();
        
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
