package com.leetcode.February.Challenges;

public class SquirrelSimulation {

	public static void main(String[] args) {
		int height=5;
		int width=7;
		int[] tree={2,2};
		int[] squirrel= {4,4};
		int[][] nuts= {{3,0}, {2,5}};
		System.out.println(minDistance(height,width,tree,squirrel,nuts));

	}
    public static int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
    	int n=nuts.length;
    	int nutToTree[]=new int[n];
    	int nutToSquirrel[]=new int[n];
    	int sum=0;
    	
    	for(int i=0;i<n;i++) {
    		nutToTree[i]=Math.abs(nuts[i][0]-tree[0])+Math.abs(nuts[i][1]-tree[1]);
    		sum+=2*nutToTree[i];
    		nutToSquirrel[i]=Math.abs(nuts[i][0]-squirrel[0])+Math.abs(nuts[i][1]-squirrel[1]);
    	}
    	
    	int min=Integer.MAX_VALUE;
    	for(int i=0;i<n;i++) {
    		int dist=sum+nutToSquirrel[i]-nutToTree[i];
    		min=Math.min(min, dist);
    	}
    	return min;
    }


}
