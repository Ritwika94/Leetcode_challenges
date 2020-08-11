package com.leetcode.juneChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class ReconstructItinerary {
	private static HashMap<String,PriorityQueue<String>> hmap=new HashMap();
	private static List<String> pathlist=new ArrayList();

	public static void main(String[] args) {
	List<List<String>> tickets=new ArrayList();
	
	List<String> l1=new ArrayList();
	l1.add("JFK");
	l1.add("KUL");
	List<String> l2=new ArrayList();
	l2.add("JFK");
	l2.add("NRT");
	List<String> l3=new ArrayList();
	l3.add("NRT");
	l3.add("JFK");
		/*
		 * List<String> l4=new ArrayList(); l4.add("NRT"); l4.add("JFK");
		 */
		/*
		 * List<String> l5=new ArrayList(); l5.add("ATL"); l5.add("SFO");
		 */
	tickets.add(l1);
	tickets.add(l2);
	tickets.add(l3);
	//tickets.add(l4);
	//tickets.add(l5);
	List<String> relist=findItinerary(tickets);
	for(int i=0;i<relist.size();i++)
	{
		System.out.println(relist.get(i)+" ");
	}
		

	}
	public static List<String> findItinerary(List<List<String>> tickets) {

		
		for(int i=0;i<tickets.size();i++)
		{
			if(hmap.containsKey(tickets.get(i).get(0)))
			{
				hmap.get(tickets.get(i).get(0)).add(tickets.get(i).get(1));
				
			}
			else
			{
				PriorityQueue<String> al=new PriorityQueue();
				al.add(tickets.get(i).get(1));
				hmap.put(tickets.get(i).get(0), al);
			}
				
				
		}
	dfs("JFK");
	return pathlist;
        
    }
	public static void dfs(String key) {
		PriorityQueue<String> alList=hmap.get(key);
		while(alList!=null && !alList.isEmpty())
		{
			dfs(alList.poll());
		}
		pathlist.add(0, key);
		
	}

}
