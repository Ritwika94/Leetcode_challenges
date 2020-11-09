package com.leetcode.november.Challenges;

import java.util.Stack;

public class AddNumbers2 {

	public static void main(String[] args) {
		
		

	}
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        Stack<Integer> s1=new Stack();
	         Stack<Integer> s2=new Stack();
	        while(l1!=null){
	            s1.push(l1.val);
	            l1=l1.next;
	        }
	        
	         while(l2!=null){
	            s2.push(l2.val);
	              l2=l2.next;
	        }
	        int temp=0;
	        int carry=0;
	       
	        ListNode prev=null;
	        while(!s1.isEmpty() || !s2.isEmpty() ){
	            temp=carry;
	            if(!s1.isEmpty())
	                temp+=s1.pop();
	             if(!s2.isEmpty())
	                temp+=s2.pop();
	            
	            carry=temp/10;
	            ListNode curr=new ListNode(temp%10);
	            curr.next=prev;
	            prev=curr;
	            
	            
	            
	        }
	        if(carry>0){
	            ListNode curr1=new ListNode(carry);
	            curr1.next=prev;
	            prev=curr1;
	        }
	        return prev;
	        
	    }

}
