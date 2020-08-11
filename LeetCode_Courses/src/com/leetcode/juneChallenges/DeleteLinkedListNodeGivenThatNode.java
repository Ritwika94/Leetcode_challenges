package com.leetcode.juneChallenges;

public class DeleteLinkedListNodeGivenThatNode {
	public void deleteNode(ListNode node) {
        ListNode temp=node.next;
        node.val=temp.val;
        node.next=temp.next;
         temp = null; 
      
      
  }
}
