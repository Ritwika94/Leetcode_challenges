package com.leetcode.november.Challenges;

public class ConvertBinaryNumberInALinkedListToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int getDecimalValue(ListNode head) {
	        ListNode p=head;
	        String str="";
	        
	        while(p!=null){
	            str=str+p.val;
	            p=p.next;
	        }
	        int n=str.length();
	        int res=0;
	        int j=0;
	        for(int i=n-1;i>=0;i--){
	            res+=(str.charAt(i)-'0')<<j;
	            j++;
	            
	        }
	        return res;
	        
	    }

}
