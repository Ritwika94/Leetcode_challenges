package com.leetcode.january.Challenges;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0)
            return 0;
        int arr[]=new int[256];
        Arrays.fill(arr,-1);
        int currlen=1;
       
        int maxlen=Integer.MIN_VALUE;
        arr[s.charAt(0)]=0;
        
        for(int i=1;i<s.length();i++){
            int prev=arr[s.charAt(i)];
           //System.out.println("Previous"+s.charAt(i)+" "+prev + (prev>=i-currlen));
            if(prev!=-1 && prev>=i-currlen)
            {
                arr[s.charAt(i)]=i;
                 if(maxlen<currlen)
                    maxlen=currlen;
               // System.out.println(i+" "+s.charAt(i)+" "+maxlen);
                currlen=i-prev;
               
            }
            else if(prev==-1 ||(prev!=-1 && prev<i-currlen)){
                
                arr[s.charAt(i)]=i;
                currlen++;
               
            }
           
            
        }
        if(maxlen<currlen)
                    maxlen=currlen;
        
        return maxlen;
        
    }

}
