package com.leetcode.november.Challenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MinimumHeightTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res=new ArrayList();
        if(n==0){
            return res;
        }
        if(n==1){
            res.add(0);
            return res;
        }
        ArrayList<HashSet<Integer>> graph=new ArrayList();
        for(int i=0; i<n; i++){
            graph.add(new HashSet<Integer>());
        }
 
        for(int i=0;i<edges.length;i++){
            graph.get(edges[i][0]).add(edges[i][1]);
             graph.get(edges[i][1]).add(edges[i][0]);
        }
        
        ArrayList<Integer> leaves=new ArrayList();
        for(int i=0;i<n;i++){
            if(graph.get(i).size()==1)
                leaves.add(i);
        }
        if(leaves.size()==0)
            return res;
        
        while(n>2){
            n=n-leaves.size();
            ArrayList<Integer> leaves_curr=new ArrayList();
            for(int l:leaves){
                int x=graph.get(l).iterator().next();
                graph.get(x).remove(l);
                if(graph.get(x).size()==1)
                    leaves_curr.add(x);
                
            }
          leaves=leaves_curr;  
        }
       return leaves; 
    }

}
