package com.leetcode.november.Challenges;

public class NumbersAtMostNGivenDigitSet {

	public static void main(String[] args) {
		String[] digits= {"1","4","9"};
		int n=1000000000;
		System.out.println(atMostNGivenDigitSet(digits,n));

	}
	 public static int atMostNGivenDigitSet(String[] digits, int n) {
         char[] s = String.valueOf(n).toCharArray();
         int len=s.length;
         int res=0;
         for(int i=1;i<len;i++){
              res+=(int)Math.pow(digits.length,i);
         }
            
       
            for(int i=0;i<len;++i)
            {
                boolean flag=false;
                for(String str:digits){
                    if(str.charAt(0)<s[i])
                        res+=Math.pow(digits.length,len-i-1);
                    else if(str.charAt(0)==s[i]){
                        flag=true;
                        break;
                    }
                }
                if(!flag)
                    return res;
            }
           return res+1;
   }

}
