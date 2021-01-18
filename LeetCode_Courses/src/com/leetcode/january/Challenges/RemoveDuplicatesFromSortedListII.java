package com.leetcode.january.Challenges;

public class RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode p=head;
      
        ListNode prev=null;
        boolean flag=false;
        while(p!=null && p.next!=null && p.val==p.next.val){
           
            p=p.next;
            
            flag=true;
        }
        if(flag){
             p=p.next;
             head=p;
              flag=false;    
        }
    
      
        while(p!=null){
            while(p!=null && p.next!=null && p.val==p.next.val){
                flag=true;
                p=p.next;
            }
            if(flag){
              
                 p=p.next;
               
                if(prev!=null){
                    
                    prev.next=p;
                }
                   
            }
            else{
                if(prev==null){
                    prev=p;
                    head=prev;
                }
                prev=p;
                p=p.next;
                
            }
            if(prev!=null)
                System.out.println("prev:"+prev.val);
            flag=false;
        }
        if(prev==null)
            return null;
        return head;
    }

}
