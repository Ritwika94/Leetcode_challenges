package com.leetcode.julyChallenges;



public class RemoveElementsFromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        ListNode ptr=head;
        ListNode prev=null;
        ListNode temp=null;
        while(ptr!=null)
        {
            if(ptr.val==val)
            {
                if(ptr==head)
                {
                     temp=ptr;
                     ptr=ptr.next;
                     head=ptr;
                    
                 }
                else
                {
                   
                   ptr=ptr.next;
                   prev.next=ptr;
                  
                }
              
              
            }
            else
            {
                 prev=ptr;
                if(ptr!=null)
                    ptr=ptr.next;
             }
           
            
        }
        return head;
        
        
    }
}
