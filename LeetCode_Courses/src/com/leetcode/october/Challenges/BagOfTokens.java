package com.leetcode.october.Challenges;

import java.util.Arrays;

public class BagOfTokens {

	public static void main(String[] args) {
		int[] tokens= {100,200,300,400};
		int P=200;
		System.out.println(bagOfTokensScore(tokens,P));

	}
	public static int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        int res=0;
        int points=0;
        while(i<=j){
            if(P>=tokens[i]){
                P-=tokens[i++];
                res=Math.max(res,++points);
            }
            else if(points>0){
                P+=tokens[j--];
                points--;
            }
            else
                break;
        }
        return res;
    }

}
