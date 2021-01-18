package com.leetcode.november.Challenges;

import java.util.ArrayList;
import java.util.List;

public class RemoveInterval {
	List<List<Integer>> res=new ArrayList();
	public static void main(String[] args) {
	}
	
	public List<List<Integer>>  removeInterval(List<List<Integer>> intervalList,
			List<Integer> intervalToBeRemoved) {
		for(List<Integer> l:intervalList) {
			if(intervalToBeRemoved.get(0)>l.get(0)) {
				ArrayList alist=new ArrayList();
				alist.add(l.get(0));
				alist.add(Math.min(l.get(1), intervalToBeRemoved.get(0)));
				res.add(alist);
			}
			
			
			if(intervalToBeRemoved.get(1)<l.get(1)) {
				ArrayList alist1=new ArrayList();
				alist1.add(Math.max(l.get(0), intervalToBeRemoved.get(1)));
				alist1.add(l.get(1));
				res.add(alist1);
				
			}
				
		}
		return res;
	}

}
