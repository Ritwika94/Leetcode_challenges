package com.leetcode.december.Challenges;


public class PlusOneLinkedList {
	static class Node  
	{ 
	    int key; 
	    Node next; 
	  
	    Node(int n)  
	    { 
	        key = n; 
	        next = null; 
	    } 
	}; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static Node head=null;
	private void plusOne() {
		Node l=null;
		Node curr=head;
		while(curr.next!=null) {
			if(curr.key<9)
				l=curr;
			curr=curr.next;
			
		}
		curr.key+=1;
		if(curr.key>9) {
			curr.key=curr.key%10;
			if(l==null) {
				insert(new Node(1));
				l=head.next;
			}
			else {
				while(l!=curr) {
					l.key=(l.key+1)%10;
					l=l.next;
				}
			}
		}
			
		}
	private void insert(Node n) {
		if (head == null) 
            head = n; 
    else
        { 
            n.next = head; 
            head = n; 
        } 
	} 

}
