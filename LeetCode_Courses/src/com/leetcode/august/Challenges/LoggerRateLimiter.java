package com.leetcode.august.Challenges;

import java.util.HashMap;

public class LoggerRateLimiter {
	static HashMap<String,Integer> msgList=new HashMap();
	public static void main(String[] args) {
		String message="Hi";
		int timestamp=37;
		boolean x=checkprintmessage(message,timestamp);
		String message1="Hi";
		int timestamp1=45;
		boolean y=checkprintmessage(message1,timestamp1);
		System.out.println(x+" "+y);

	}

	private static boolean checkprintmessage(String message, int timestamp) {
		
		boolean canPrint=false;
		
		if(msgList.containsKey(message))
		{
			
			int previousTimestamp=msgList.get(message);
			System.out.println(previousTimestamp);
			if(timestamp-previousTimestamp>=10)
				canPrint=true;
			msgList.put(message, timestamp);
			
		}
		else
		{
			
			canPrint=true;
			msgList.put(message, timestamp);
		}
			
		return canPrint;
	}

}
