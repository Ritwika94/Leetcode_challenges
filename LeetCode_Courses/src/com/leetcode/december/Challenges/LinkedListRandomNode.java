package com.leetcode.december.Challenges;

import java.util.Random;

public class LinkedListRandomNode {
	 ListNode head;
	    Random rand;
	    /** @param head The linked list's head.
	        Note that the head is guaranteed to be not null, so it contains at least one node. */
	    public LinkedListRandomNode(ListNode head) {
	        this.head=head;
	        this.rand=new Random();
	    }
	    
	    /** Returns a random node's value. */
	    public int getRandom() {
	        ListNode p=head;
	        int c=1;
	        int res=0;
	        
	        while(p!=null){
	          
	            if(rand.nextInt(c)==0)
	                res=p.val;
	            c++;
	            p=p.next;
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
