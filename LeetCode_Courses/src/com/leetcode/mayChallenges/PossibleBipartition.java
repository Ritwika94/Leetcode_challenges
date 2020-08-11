package com.leetcode.mayChallenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PossibleBipartition {

	public static void main(String[] args) {
		int N = 4;
		int[][] dislikes = {{1,2},{1,3},{2,4}};
		System.out.println(possibleBipartition(N,dislikes));

	}
	
	public static boolean possibleBipartition(int N, int[][] dislikes) {
		List<Integer> nodelist[]=new ArrayList[N];
		for(int i=0;i<N;i++)
		{
			nodelist[i]=new ArrayList<Integer>();
		}
		
		
		for(int i=0;i<dislikes.length;i++)
		{
			int x=dislikes[i][0]-1;
			int y=dislikes[i][1]-1;
			nodelist[x].add(y);
			nodelist[y].add(x);
			
		}
		
		
		int visited[]=new int[N];
		for(int i=0;i<N;i++)
		{
			if(visited[i]!=0)
			{
				continue;
			}
			visited[i]=1;
			Queue<Integer>qnodes=new LinkedList();
			qnodes.add(i);
			while(!qnodes.isEmpty())
			{
				int x=qnodes.remove();
				
				for(int val:nodelist[x])
				{
					if(visited[val]==visited[x])
						return false;
					if(visited[val]==0)
					{
						visited[val]=-visited[x];
						qnodes.add(val);
					}
						
				}
			}
				
		}
		
	return true;
        
    }

	

}
