package com.leetcode.august.Challenges;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		System.out.println(titleToNumber("ABCD"));

	}
    public static int titleToNumber(String s) {
        int len=s.length();
       int sum1=0;
       for(int i=1;i<=s.length()-1;i++)
        {
           sum1+=Math.pow(26,i);
        }
      
        int i=0;
        for( i=0;i<s.length()-1;i++)
        {
            int a=s.charAt(i)-'A';
            int x=(s.length()-1)-i;
            if(a!=0)
             sum1+=a*Math.pow(26,x);
             
        }
      
       
       sum1+=(s.charAt(s.length()-1)-'A')+1;
       return sum1;
       
   }

}
