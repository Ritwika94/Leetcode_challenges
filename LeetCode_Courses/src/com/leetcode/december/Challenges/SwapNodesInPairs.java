package com.leetcode.december.Challenges;

public class SwapNodesInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode swapPairs(ListNode head) {
	        if(head==null ||head.next==null)
	            return head;
	        ListNode p=head;
	        ListNode q=head.next;
	        ListNode curr=q;
	        ListNode prev=null;
	        while(p!=null && q!=null){
	            prev=p;
	            ListNode temp=q.next;
	            q.next=p;
	            
	            p=temp;
	            if(temp!=null){
	               q=temp.next;
	            }
	            else
	                q=null;
	            
	            if(q==null)
	                prev.next=p;
	            else
	                prev.next=q;
	               
	        }
	       return curr; 
	    }

}
