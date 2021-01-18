package com.leetcode.january.Challenges;

import java.util.ArrayList;
import java.util.List;

public class BeautifulArrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 List<List<Integer>> alist=new ArrayList();
	    public int countArrangement(int n) {
	        int arr[]=new int[n];
	        
	        for(int i=0;i<n;i++)
	            arr[i]=i+1;
	        List<Integer> list=new ArrayList();
	        getWays(list,arr);
	        return alist.size();
	    }
	    
	    public void getWays(  List<Integer> list,int arr[]){
	        if(list.size()>=arr.length){
	            alist.add(new ArrayList<>(list));
	        }
	        
	        for(int i=0;i<arr.length;i++){
	            if(list.contains(arr[i]))
	                continue;
	            int index=list.size()+1;
	            if(arr[i]% index==0 || index%arr[i]==0){
	                list.add(arr[i]);
	                getWays(list,arr);
	                list.remove(list.size()-1);
	            }
	        }
	        
	    }

}
