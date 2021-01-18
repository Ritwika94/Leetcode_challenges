package com.leetcode.january.Challenges;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        int carry=0;
	        ListNode node=new ListNode();
	        ListNode head=node;
	        while(l1!=null && l2!=null){
	            int val=l1.val+l2.val+carry;
	           
	            if(val>=10)
	            {
	                carry=1;
	                val=val%10;
	            }
	            else
	                carry=0;
	            
	            node.next=new ListNode(val);
	            node=node.next;
	            l1=l1.next;
	            l2=l2.next;
	            
	        }
	        while(l1!=null){
	            int val=l1.val+carry;
	            if(val>=10){
	                carry=1;
	                val=val%10;
	            }
	            else
	                carry=0; 
	            node.next=new ListNode(val);
	            node=node.next;
	            l1=l1.next;
	        }
	         while(l2!=null){
	            int val=l2.val+carry;
	            if(val>=10){
	                carry=1;
	                val=val%10;
	            }
	            else
	                carry=0; 
	            node.next=new ListNode(val);
	            node=node.next;
	            l2=l2.next;
	        }
	        
	        if(carry==1)
	            node.next=new ListNode(1);
	            node=node.next;
	        
	        
	        return head.next;
	        
	    }

}
