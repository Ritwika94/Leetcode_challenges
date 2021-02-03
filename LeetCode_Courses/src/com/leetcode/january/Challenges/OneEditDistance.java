package com.leetcode.january.Challenges;

public class OneEditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isOneEditDistance(String s, String t) {
		int m=s.length();
		int n=t.length();
		int count=0;
		if(Math.abs(m-n)>1)
			return false;
		int i=0,j=0;
		while(i<m && j<n) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
				j++;
			}
			else {
			
				count++;
				if(count>1)
					return false;
				if(m>n) {
					i++;
				}
				else if(m<n)
					j++;
				else {
					i++;
					j++;
				}
					
			}
		}
	if(i<m || j<n)
		count++;
	
	if(count>1)
		return false;
	return true;
	}
}
