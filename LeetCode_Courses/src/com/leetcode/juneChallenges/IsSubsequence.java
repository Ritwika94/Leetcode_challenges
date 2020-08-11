package com.leetcode.juneChallenges;

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isSubsequence(String s, String t) {
        if(s.isEmpty())
            return true;
        
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        int j=0;
        for(int i=0;i<arr2.length && j<arr1.length ;i++)
        {
            if(arr2[i]==arr1[j])
            {
                j++;
             }
        }
        if(j==arr1.length)
            return true;
        else
            return false;
        
        
    }

}
