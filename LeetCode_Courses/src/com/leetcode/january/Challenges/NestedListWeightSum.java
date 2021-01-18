package com.leetcode.january.Challenges;

import java.util.List;

public class NestedListWeightSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int depthSum(List<NestedInteger> nestedList) {
        return ds(1, nestedList);
    }

	private int ds(int depth, List<NestedInteger> nestedList) {
		if(nestedList==null || nestedList.size()==0)
			return 0;
		int sum=0;
		for(NestedInteger ni:nestedList) {
			if(ni.isInteger()) {
				sum+=ni.getInteger()*depth;
			}
			else {
				sum+=ds(depth+1,ni.getList());
			}
		}
		return sum;
	}

}
