package com.leetcode.julyChallenges;

public class AngleBetweenHandsOfClock {

	public static void main(String[] args) {
		System.out.println(angleClock(3,30));

	}
	public static double angleClock(int hour, int minutes) {
	      if(hour<0|| minutes<0 || hour>12 || minutes>60)
	          return 0;
	      if(hour==12)
	          hour=0;
	     if(minutes==60)
	     {
	         minutes=0;
	         hour++;
	         if(hour>12)
	             hour=hour-12;
	     }
	        
	    double angle1=(hour*60+minutes)*0.5;
	    double angle2=minutes*6;
	    double diff=Math.abs(angle1-angle2);
	    double min_angle=Math.min(360-diff,diff);
	    return min_angle;
	        
	        
	    }

}
