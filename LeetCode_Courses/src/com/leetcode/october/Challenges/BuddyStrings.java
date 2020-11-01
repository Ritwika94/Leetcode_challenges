package com.leetcode.october.Challenges;

import java.util.ArrayList;

public class BuddyStrings {

	public static void main(String[] args) {
		String A = "aaaaaaabc";
		String B = "aaaaaaacb";
		System.out.println(buddyStrings(A,B));

	}
	 public static boolean buddyStrings(String A, String B) {
	        int n1=A.length();
	        int n2=B.length();
	        if(n1!=n2)
	            return false;
	    
	        int count=0;
	      
	         if(A.equals(B)){
	             
	            for(int i=0;i<n1-1;i++){
	                int m=i+1;
	                while(m<n2){
	                     if(A.charAt(i)==B.charAt(m))
	                     {
	                         count=count+2;
	                         break;
	                     }
	                    m++;
	                }
	                 
	            }
	              
	             if(count>=2){
	                
	                 return true;
	             }
	                 
	        }
	      
	        boolean flag=false;
	        ArrayList<Integer> list=new ArrayList();
	      
	        for(int i=0,j=0;i<n1 && j<n2;i++,j++){
	             
	            if(A.charAt(i)==B.charAt(j))
	                continue;
	            else
	            {
	             
	                list.add(i);
	                flag=true;
	            }
	        }
	   
	      
	        if(list.size()==2){
	          
	            int x=list.get(0);
	            int y=list.get(1);
	            String P=swap(A,x,y);
	          
	            if(P.equals(B))
	                return true;
	        }
	        return false;
	        
	        
	    }
	    
	    public static String swap(String str,int i,int j){
	        StringBuilder sb = new StringBuilder(str); 
	        sb.setCharAt(i, str.charAt(j)); 
	        sb.setCharAt(j, str.charAt(i)); 
	        return sb.toString(); 
	    }

}
