package com.leetcode.december.Challenges;

public class ReachANumber {

	public static void main(String[] args) {
		System.out.println(reachNumber(45678));
		System.out.println(reachNumber(-4567899));

	}
	  
    public static int reachNumber(int target) {
          target = Math.abs(target);
      int sum=0;
        int count=0;
      while(sum<target){
           count++;
          sum+=count;
         
      }
        
        while((sum-target)%2!=0){
           count++;
            sum+=count;
        }
        
        return count;
    }
}
