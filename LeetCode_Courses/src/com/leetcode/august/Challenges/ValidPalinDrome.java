package com.leetcode.august.Challenges;

public class ValidPalinDrome {

	public static void main(String[] args) {
		
		String str="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));

	}
	public static boolean isPalindrome(String s) {
        if(s==null)
            return true;
        int len=s.length();
       
        int i=0;
        int j=0;
        int k=0;
        for(j=0;j<len;j++)
        {
            if(!(Character.isLetterOrDigit(s.charAt(j))))
               continue;
            else
                break;
         }
         if(j==len)
               {
                  
                 return true;
               }
         for(k=len-1;k>=0;k--)
        {
            if(!(Character.isLetterOrDigit(s.charAt(k))))
               continue;
            else
                break;
         }
        if(j==k)
            return true;
        String str=s.substring(j,len);
        len=str.length();
        if(len==1)
          return true;
        int p=k;
        for(i=j;i<len/2;i++)
        {
           //System.out.println(Character.isLetterOrDigit(s.charAt(i)));
            if((!(Character.isLetterOrDigit(s.charAt(i)))) && (Character.isLetterOrDigit(s.charAt(p))))
             {
                 
                  continue;
            }
            if((Character.isLetterOrDigit(s.charAt(i))) && (!(Character.isLetterOrDigit(s.charAt(p)))))
             {
                  i--;
                  p--;
                  continue;
            }
            if((!(Character.isLetterOrDigit(s.charAt(i)))) && (!(Character.isLetterOrDigit(s.charAt(p)))))
             {
                 
                 p--;
                continue;
            }
           
          char x=Character.toUpperCase(s.charAt(i));
          char y=Character.toUpperCase(s.charAt(p));
          //System.out.println(x+" "+y);
         
         if(Character.compare(x,y)==0)
                {
                
                  p--;
                  continue;
                 }
            else
                break;
         }
        if(i==len/2)
            return true;
        
        return false;
        
    }

}
