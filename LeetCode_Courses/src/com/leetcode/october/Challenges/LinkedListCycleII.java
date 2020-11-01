package com.leetcode.october.Challenges;

public class LinkedListCycleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode detectCycle(ListNode head) {
	       
		    
	       ListNode s=head; 
	        ListNode f=head; 
	        if(head==null || head.next==null)
	            return null;
	        while(s!=null && f!=null && f.next!=null){
	            s=s.next;
	            f=f.next.next;
	            if(s==f){
	                 break;
	            }
	      }
	          if(f==null)
	              return null;
	        s=head;
	        while(s!=null && f!=null && f!=s)
	        {
	            f=f.next;
	            s=s.next;
	        }
	        return f;
	    }

}
