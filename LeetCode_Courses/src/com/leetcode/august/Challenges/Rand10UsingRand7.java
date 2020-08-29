package com.leetcode.august.Challenges;

import java.util.Random;

public class Rand10UsingRand7 {

	public static void main(String[] args) {
		System.out.println(rand10());

	}
	 public static int rand10() {
	       int random=41;
	        
	      while(random>40)
	      {
	           random = 7 * (rand7() - 1) + (rand7());
	   
	       }
	       return random % 10 + 1;
	    }
	private static int rand7() {
		Random rand = new Random(); 
		
		 return genRand(1,7);
		
	}
	private static int genRand(int min, int max) {
		if (min > max || (max - min + 1 > Integer.MAX_VALUE)) {
			throw new IllegalArgumentException("Invalid range");
		}

		return new Random().nextInt(max - min + 1) + min;
	}

}
