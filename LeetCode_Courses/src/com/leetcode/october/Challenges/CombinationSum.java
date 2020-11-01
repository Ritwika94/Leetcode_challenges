package com.leetcode.october.Challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
	public static List<List<Integer>>  alist=new ArrayList();
	public static void main(String[] args) {
		
		int[] candidates = {2,3,5};
		int target = 8;
		combinationSum(candidates,target);
		for(List<Integer> l:alist) {
			System.out.print("[");
			for(Integer i:l) {
				System.out.print(i+" ");
			}
			System.out.print("]");
			System.out.println();
		}
	}
	
    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
		LinkedList<Integer> list=new LinkedList();
		findCombo(list,candidates,target,0,0);
		return alist;
        
    }
	public static  void findCombo(LinkedList<Integer> list, int[] candidates, int target, int sum, int start) {
		if(sum==target) {
			alist.add(new ArrayList(list));
			return;
		}
		if(sum>target) 
			return;
		for(int i=start;i<candidates.length;i++) {
			list.add(candidates[i]);
			findCombo(list,candidates,target,sum+candidates[i],i);
			list.removeLast();
			
		}
		
	}

}
