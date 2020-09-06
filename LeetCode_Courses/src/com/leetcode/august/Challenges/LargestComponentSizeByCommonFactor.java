package com.leetcode.august.Challenges;

import java.util.HashMap;

public class LargestComponentSizeByCommonFactor {

	public static void main(String[] args) {
		int[] A= {2,3,6,7,4,12,21,39};
		System.out.println(largestComponentSize(A));

	}
	public static int largestComponentSize(int[] A) {
        int parent[]=new int[100001];
        for(int i=0;i<100001;i++)
            parent[i]=-1;
        for(int x:A)
        {
            for(int i=2;i<=Math.sqrt(x);i++)
            {
            	if(x%i==0)
            	{
            		 union(i,x,parent);
                     union(i,x/i,parent);
            	}
               
                
            }
         }
        HashMap<Integer,Integer> hmap=new HashMap();
        int count=0;
        for(int x:A)
        {
            int xp=find(x,parent);
            count=Math.max(count,1+hmap.getOrDefault(xp,0));
            hmap.put(xp,1+hmap.getOrDefault(xp,0));
            
         }
		return count;
        
    }
	private static int find(int x, int[] parent) {
		if(parent[x]==-1)
			return x;
		parent[x]=find(parent[x],parent);
		return parent[x];
	}
	private static void union(int x, int y, int[] parent) {
		int xp=find(x,parent);
		int yp=find(y,parent);
		if(xp!=yp)
			parent[yp]=xp;
		
	}

}
