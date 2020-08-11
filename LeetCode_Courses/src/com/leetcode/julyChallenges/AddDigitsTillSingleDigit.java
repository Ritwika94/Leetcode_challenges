package com.leetcode.julyChallenges;

public class AddDigitsTillSingleDigit {

	public static void main(String[] args) {
		int num=38;
		System.out.println(addDigits(num));

	}
	
	public static int addDigits(int num) {
        int sum=num;
        int p=0;
        
        while(sum>9)
        {
           
            p=sum;
            sum=0;
            while(p>0)
            {
                int rem=p%10;
                sum+=rem;
                p=p/10;
            }
            
        }
    
            return sum;
        
    }

}
