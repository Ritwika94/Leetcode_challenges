package com.leetcode.mayChallenges;

import java.util.HashMap;
import java.util.PriorityQueue;

public class CharacterSortByFrequency {

	public static void main(String[] args) {
		System.out.println(frequencySort("tree"));

	}
	public static String frequencySort(String s) {
        HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();
        for(char c: s.toCharArray())
        {
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character>  mheap=new  PriorityQueue<>((a,b)->hmap.get(b)-hmap.get(a));
        mheap.addAll(hmap.keySet());
        StringBuilder str1=new  StringBuilder();
        while(!mheap.isEmpty())
        {
            char c1=mheap.remove();
            for(int i=0;i<hmap.get(c1);i++)
                str1.append(c1);
        }
        return str1.toString();
        
    }

}
