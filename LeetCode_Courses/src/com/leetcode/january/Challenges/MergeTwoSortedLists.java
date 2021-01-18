package com.leetcode.january.Challenges;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        if(l1==null && l2==null)
	            return null;
	        
	        ListNode z1=new ListNode();
	        ListNode head=z1;
	        
	        while(l1!=null && l2!=null){
	            if(l1.val<l2.val){
	                z1.next=l1;
	                l1=l1.next;
	                z1=z1.next;
	            }
	            else if(l1.val>l2.val){
	                z1.next=l2;
	                l2=l2.next;
	                z1=z1.next;
	            }
	            else if(l1.val==l2.val){
	                z1.next=l1;
	                l1=l1.next;
	                z1=z1.next;
	                z1.next=l2;
	                l2=l2.next;
	                z1=z1.next;
	                
	            }
	        }
	        while(l1!=null){
	             z1.next=l1;
	             l1=l1.next;
	             z1=z1.next;
	        }
	         while(l2!=null){
	             z1.next=l2;
	             l2=l2.next;
	             z1=z1.next;
	        }
	        head=head.next;
	        return head;
	    }

}
