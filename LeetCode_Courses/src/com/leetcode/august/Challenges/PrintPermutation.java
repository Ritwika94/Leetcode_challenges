package com.leetcode.august.Challenges;

import java.util.ArrayList;

public class PrintPermutation {

	public static void main(String[] args) {
		String s="DIDI";
		int arr[]=findPermutation(s);
		for(int val:arr)
			System.out.print(val+" ");

	}
	 public static int[] findPermutation(String s) 
	 {
		 char arr[]=s.toCharArray();
		 int next=0;
		ArrayList<Integer> alist=new ArrayList();
		 int posOfI=0;
		 if(arr[0]=='D')
		 {
			 alist.add(1);
			 alist.add(0);
			 posOfI=1;
			 next=3;
			 
		 }
		 if(arr[0]=='I')
		 {
			 alist.add(0);
			 alist.add(1);
			 posOfI=1;
			 next=3;
			 
		 }
		 for(int i=1;i<arr.length;i++)
		 {
			 if(arr[i]=='I')
			 {
				 alist.add(next);
				 next+=1;
				 posOfI=i+1;
			 }
			 else if(arr[i]=='D')
			 {
				 alist.add(alist.get(i));
				 for(int j=posOfI;j<=i;j++)
					 alist.set(j, alist.get(j)+1);
				 next+=1;
			 }
			
		 }
		return alist.stream().mapToInt(i->i).toArray();
		 
	 }
}
