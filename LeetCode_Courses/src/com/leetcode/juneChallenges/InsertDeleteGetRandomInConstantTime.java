package com.leetcode.juneChallenges;

import java.util.HashMap;
import java.util.Random;

public class InsertDeleteGetRandomInConstantTime {
	 /** Initialize your data structure here. */
    HashMap<Integer, Integer> valueMap;
    HashMap<Integer, Integer> idxMap;
    public InsertDeleteGetRandomInConstantTime() {
        valueMap = new HashMap<>();
        idxMap = new HashMap<>();
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
          if(valueMap.containsKey(val)){
            return false;
        }
 
        valueMap.put(val, valueMap.size());
        idxMap.put(idxMap.size(), val);
 
        return true;
        
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(valueMap.containsKey(val)){
            int idx = valueMap.get(val);
            valueMap.remove(val);
            idxMap.remove(idx);
 
            Integer tailElem = idxMap.get(idxMap.size());
            if(tailElem!=null){
                idxMap.put(idx,tailElem);
                valueMap.put(tailElem, idx);
            }
 
            return true;
        }
 
        return false;
           
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
         if(valueMap.size()==0){
            return -1;
        }
 
        if(valueMap.size()==1){
            return idxMap.get(0);
        }
 
        Random r = new Random();
        int idx = r.nextInt(valueMap.size());
 
        return idxMap.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */