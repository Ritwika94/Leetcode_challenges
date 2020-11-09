package com.leetcode.november.Challenges;

public class InsertionSortInALinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  ListNode sortedList=null;
	    public ListNode insertionSortList(ListNode head) {
	       
	        ListNode current=head;
	        while(current!=null){
	            ListNode next=current.next;
	            insertNode(current);
	            current=next;
	        }
	        head=sortedList;
	        return head;
	    }
	    
	      public void insertNode(ListNode curr){
	          if(sortedList==null || sortedList.val>=curr.val){
	              curr.next=sortedList;
	              sortedList=curr;
	          }
	          else{
	              ListNode temp=sortedList;
	              while(temp.next!=null && temp.next.val<curr.val){
	                  temp=temp.next;
	              }
	              curr.next=temp.next;
	              temp.next=curr;
	          }
	      }

}
