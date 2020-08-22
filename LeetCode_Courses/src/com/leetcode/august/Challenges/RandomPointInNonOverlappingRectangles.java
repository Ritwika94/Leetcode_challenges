package com.leetcode.august.Challenges;

import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class RandomPointInNonOverlappingRectangles {
    private int[][] rects=null;
    TreeMap<Integer ,Integer>hmap=new TreeMap();
    int sum=0;
	public RandomPointInNonOverlappingRectangles(int[][] rects) {
		
		this.rects = rects;
		for(int i=0;i<rects.length;i++)
		{
			sum+=(rects[i][2]-rects[i][0]+1)*(rects[i][3]-rects[i][1]+1);
			hmap.put(sum, i);
		}
	}
	 public int[] pick() {
		 Random rnd= new Random();
		 int index=hmap.ceilingKey(rnd.nextInt(sum)+1);
		 int rect[]=rects[hmap.get(index)];
		 int left = rect[0], right = rect[2], bot = rect[1], top = rect[3];
	     return new int[]{left + rnd.nextInt(right - left + 1), bot + rnd.nextInt(top - bot + 1) };
				 
		
		 
			  }
		  	 


}
