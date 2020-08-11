package com.leetcode.mayChallenges;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		ListNode head=new ListNode(2);
		head.next=new ListNode(1);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(5);
		head.next.next.next.next=new ListNode(6);
		head.next.next.next.next.next=new ListNode(4);
		head.next.next.next.next.next.next=new ListNode(7);
		head.next.next.next.next.next.next.next=null;
		ListNode p=oddEvenList(head);
		while(p!=null)
		{
			System.out.print(p.val+" ");
			p=p.next;
		}


	}
	
	 public static ListNode oddEvenList(ListNode head) {
		 if(head==null)
			 return null;
		 if(head.next==null)
			 return head;
		 ListNode odd_start=head;
		 ListNode even_start=head.next;
		 ListNode odd=odd_start;
		 ListNode even=even_start;
		
		 while(odd.next!=null && even.next!=null)
		 {
			
			 odd.next=odd.next.next;
			 odd=odd.next;
			 even.next=even.next.next;
			 even=even.next;
		 }
		 if(odd.next!= null && even.next==null)
		 {
			 odd.next=even_start;
			 
		 }
			 
		 if(odd.next==null && even==null)
			 odd.next=even_start;
		 
		 
		return head;
	        
	    }

}
