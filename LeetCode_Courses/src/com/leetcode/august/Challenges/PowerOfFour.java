package com.leetcode.august.Challenges;

public class PowerOfFour {

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(16));
		System.out.println(isPowerOfFour(5));

	}
	public static boolean isPowerOfFour(int num) {
        int count_zer0=0;
        int count_one=0;
        while(num>0)
        {
            if((num&1)==1)
                count_one++;
            else
             count_zer0++;
            num=num>>1;
        }
         return count_one==1 && (count_zer0%2==0);
}

}
