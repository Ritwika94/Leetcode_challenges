package com.leetcode.august.Challenges;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationIterator {

	public static void main(String[] args) {
		 CombinationIterator obj = new CombinationIterator("abc", 2);
		  String param_1 = obj.next();
		  boolean param_2 = obj.hasNext();

	}
	public static String characters=null;
    public static int combinationLength=0;
    public ArrayList<String> alist=new ArrayList();
    

    public CombinationIterator(String characters, int combinationLength) {
        this.characters=characters;
        this.combinationLength=combinationLength;
        getcombo(characters,alist,combinationLength);
        for(int i=0;i<alist.size();i++)
           System.out.println(alist.get(i)); 
        
    }
    
    public String next() {
        if(!alist.isEmpty())
        {
            String nextString=alist.remove(0);
            System.out.println("String removed:"+nextString);
            
            return nextString;
        }
        return null;
 
    }
    
    public boolean hasNext() {
      
        if(!alist.isEmpty() && alist.get(0)!=null)
        {
              System.out.println(alist.get(0));
              return true;
        }
            
        return false;
        
    }
    
    public void getcombo(String characters, ArrayList<String> alist,int combinationLength)
    {
      int n=characters.length();
       for (int i = 0; i < (1<<n); i++) 
        {
            String str="";
            for(int j=0;j<n;j++)
            {
              if((i & (1<<j))>0)
              {
                  str+=characters.charAt(j);
                 
              }
               
                 
            }
            if(str!="" && str.length()==combinationLength)
              alist.add(str);
             
          
        }
        Collections.sort(alist);
      
     }

}
