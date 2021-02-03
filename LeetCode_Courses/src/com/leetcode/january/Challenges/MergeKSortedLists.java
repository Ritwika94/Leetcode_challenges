package com.leetcode.january.Challenges;

import java.util.PriorityQueue;

public class MergeKSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode mergeKLists(ListNode[] lists) {
	        if(lists==null ||lists.length==0)
	            return null;
	        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->a-b);
	        
	        for(int i=0;i<lists.length;i++){
	            ListNode l=lists[i];
	            while(l!=null){
	                pq.add(l.val);
	                l=l.next;
	            }
	        }
	        ListNode head=new ListNode(0);
	        ListNode p=head;
	        while(!pq.isEmpty()){
	            p.next=new ListNode(pq.peek());
	            pq.remove();
	            p=p.next;
	        }
	       return head.next;
	    }

}
