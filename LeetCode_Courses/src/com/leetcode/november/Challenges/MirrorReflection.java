package com.leetcode.november.Challenges;

public class MirrorReflection {

	public static void main(String[] args) {
		System.out.println(mirrorReflection(3,2));

	}
	public static int mirrorReflection(int p, int q) {
        int m=1;
        int n=1;
        while(m*p!=n*q){
            m=++n*q/p;
           
        }
         if(n%2==0)
             return 2;
        if(m%2==0)
            return 0;
        if(m%1==0)
            return 1;
        
        throw new IllegalArgumentException();
        
    }

}
