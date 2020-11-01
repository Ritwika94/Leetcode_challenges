package com.leetcode.october.Challenges;

public class RotateLinkedListToTheRightByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode rotateRight(ListNode head, int k) {
	        if(head==null || head.next==null || k==0)
	            return head;
	      ListNode end=head;
	        int n=0;
	       
	            while(end.next!=null){
	                
	                end=end.next;
	                n++;
	            }
	         n++;
	        
	         if(k>=n)
	             k=k%n;
	        
	        if(k==0)
	            return head;
	        
	         ListNode curr=head;
	         ListNode prev=null;
	         for(int i=1;i<n-k+1;i++){
	             prev=curr;
	             curr=curr.next;
	         }
	      
	        end.next=head;
	        head=curr;
	        prev.next=null;
	        
	 
	       
	        return head;
	  }

}
