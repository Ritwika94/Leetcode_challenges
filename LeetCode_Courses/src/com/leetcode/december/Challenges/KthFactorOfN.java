package com.leetcode.december.Challenges;

import java.util.HashSet;

public class KthFactorOfN {

	public static void main(String[] args) {
		int n=12;
		int k=3;
		System.out.println(kthFactor(n,k));

	}
	public static int kthFactor(int n, int k) {
        HashSet<Integer> hset=new HashSet<>();
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                hset.add(i);
                c++;
                }
            if(c==k)
                return i;
 
        }
    
        
        return -1;
    }

}
