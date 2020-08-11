package com.leetcode.julyChallenges;

public class FlatteningMultiLevelLinkedList {

	public static void main(String[] args) {
		

	}
	  public Node flatten(Node head) {
	        if(head==null)
	            return null;
	        Node p=head;
			Node x=head.next;
			head=formList(p,x,head);
	        
			return head;
	        }
		public Node formList(Node p, Node x, Node head) {
	        
			while(p.child==null && x!=null)
			{
				p=p.next;
				x=p.next;
			}
			if(p.child==null && x==null)
				return head;
		
			p.next=formList(p.child,p.child.next,p.child);
	        p.next.prev=p;
	        p.child=null;
			Node s=head;
			while(s.next!=null)
				s=s.next;
	        if(x!=null)
	        {
	            s.next=formList(x,x.next,x);
	            s.next.prev=s;
	        }
			
	     
			return head;
			
			
		}
}