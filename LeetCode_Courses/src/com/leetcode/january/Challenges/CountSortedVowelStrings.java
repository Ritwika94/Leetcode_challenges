package com.leetcode.january.Challenges;

import java.util.ArrayList;
import java.util.List;

public class CountSortedVowelStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 ArrayList<String> tset=new ArrayList<>();
	    public int countVowelStrings(int n) {
	        String res[]={"a","e","i","o","u"};
	        List<String> list=new ArrayList();
	        count(res,new StringBuilder(),n,0);
	       
	        return tset.size();
	    }
	    
	      public void count(String res[], StringBuilder str,int n,int start) {
	          if(str.length()==n){
	             
	              tset.add(str.toString());
	              return;
	          }
	          
	          for(int i=start;i<res.length;i++){
	              str.append(res[i]);
	              count(res,str,n,i);
	              str.deleteCharAt( str.length() - 1 );
	          }
	          
	      }

}
