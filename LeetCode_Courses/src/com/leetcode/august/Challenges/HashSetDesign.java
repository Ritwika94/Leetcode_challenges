package com.leetcode.august.Challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashSetDesign {
	private int bucketsNum;
	private List<Integer> bucketlist[];
	int count=0;
	double loadfactor=0.75;
	public int hash(int key){
        return key % bucketsNum;
    }
	public HashSetDesign() {
    	bucketlist=new ArrayList[bucketsNum];
    	bucketsNum=15000;
	}

    
    public void add(int key) {
       int index=hash(key);
      
       if(loadfactor*bucketsNum==count)
       {
    	   bucketsNum*=2;
    	   List<Integer> old_bucketlist[]=bucketlist;
    	  bucketlist=new ArrayList[bucketsNum];
    	  for(int i=0;i<old_bucketlist.length;i++)
    		  bucketlist[i]=old_bucketlist[i];
    	   
       }
       if(bucketlist[index]==null)
    	   bucketlist[index]=new ArrayList();
       if(bucketlist[index].indexOf(key)==-1)
    	   bucketlist[index].add(key);
    	count++;   
    	
    }
    
    
	public void remove(int key) {
		 int index=hash(key);
		 if(bucketlist[index]==null)
			 return;
		 if(bucketlist[index].indexOf(key)!=-1)
			 bucketlist[index].remove(bucketlist[index].indexOf(key));
		 
        
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
    	 int index=hash(key);
    	 return(bucketlist[index]!=null && bucketlist[index].indexOf(key)!=-1);
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
