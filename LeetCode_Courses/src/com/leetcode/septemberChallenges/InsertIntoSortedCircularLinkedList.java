package com.leetcode.septemberChallenges;

public class InsertIntoSortedCircularLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static class Node{
		int val;
		Node next;
		Node(){
			
		}
		Node(int val,Node next){
			this.val=val;
			this.next=next;
		}
		
	}
	public static Node insertIntoList(Node head,int item) {
		if(head==null) {
			Node newNode=new Node();
			newNode.val=item;
			newNode.next=newNode;
			return newNode;
		}
		Node max=head;
		while(max.next!=head && max.val<=max.next.val) {
			max=max.next;
		}
		Node min=max.next,curr=min;
		
		if(item>=max.val || item<=min.val) {
			Node newNode=new Node(item,min);
			max.next=newNode;
		}
		else {
			while(curr.next.val<item) {
				curr=curr.next;
			}
			Node newNode=new Node(item,curr.next);
			curr.next=newNode;
			
		}
		return head;
		
		
	}

}
