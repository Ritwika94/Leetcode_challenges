package com.leetcode.august.Challenges;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		int n=3;
		System.out.println(getRow(n));

	}
	 public static List<Integer> getRow(int rowIndex) {
	        ArrayList<Integer> alist=new ArrayList();
	        alist.add(1);
	        for(int i=1;i<=rowIndex;i++)
	        {
	             for(int j=alist.size()-2;j>=0;j--)
	                 alist.set(j+1,alist.get(j)+alist.get(j+1));
	             alist.add(1);
	         }
	        return alist;
	    }

}
