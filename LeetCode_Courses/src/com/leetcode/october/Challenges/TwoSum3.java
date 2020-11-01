package com.leetcode.october.Challenges;

import java.util.ArrayList;
import java.util.HashSet;

public class TwoSum3 {
	private ArrayList<Integer> list;

	TwoSum3(){
		this.list=new ArrayList<Integer>();
	}
	
	public  void add(int num) {
		list.add(num);
	}
	public  boolean find(int num) {
		HashSet<Integer> hset=new HashSet<Integer>();
		for(int i=0;i<list.size();i++) {
			if(hset.contains(num-list.get(i)))
				return true;
			hset.add(list.get(i));
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
