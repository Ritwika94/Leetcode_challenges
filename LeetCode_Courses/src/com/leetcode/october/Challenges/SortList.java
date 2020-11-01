package com.leetcode.october.Challenges;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public ListNode sortList(ListNode head) {
	       if(head==null || head.next==null)
	           return head;
	        ListNode middle=getMiddle(head);
	        ListNode middleNext=middle.next;
	        
	        middle.next=null;
	        
	        ListNode left=sortList(head);
	        ListNode right=sortList(middleNext);
	        
	        ListNode sortedList=mergeSorted(left,right);
	        return sortedList;
	        
	    }
	     public ListNode getMiddle(ListNode head){
	         if(head==null)
	             return head;
	         ListNode s=head;
	         ListNode f=head;
	         
	         while(f.next!=null && f.next.next !=null){
	             s=s.next;
	             f=f.next.next;
	         }
	         
	         return s;
	     }
	    
	     public ListNode mergeSorted(ListNode first,ListNode second){
	         ListNode result=null;
	         if(first==null)
	             return second;
	         if(second==null)
	             return first;
	             if(first.val<=second.val){
	                result=first;
	                result.next=mergeSorted(first.next,second);
	             }
	         else {
	             result=second;
	              result.next=mergeSorted(first,second.next);
	         }
	         return result;

}
}
