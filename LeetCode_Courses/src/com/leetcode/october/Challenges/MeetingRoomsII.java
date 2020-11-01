package com.leetcode.october.Challenges;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
	static class Interval{
		int start;
		int end;
		Interval(){
			start=0;
			end=0;
		}
		Interval(int start,int end){
			this.start=start;
			this.end=end;
		}
	}
	public static void main(String[] args) {
		Interval[] intervals=new Interval[3] ;
		Interval x=new Interval(0,30);
		Interval y=new Interval(5,10);
		Interval z=new Interval(15,20);
		intervals[0]=x;
		intervals[1]=y;
		intervals[2]=z;
		System.out.println("Minimum Number Of Meeting Rooms Needed is:"+minMeetingrooms(intervals));

	}
	public static int minMeetingrooms(Interval intervals[]) {
		if(intervals==null ||intervals.length==0)
			return 0;
		Arrays.sort(intervals,(a,b)->a.start-b.start);
		PriorityQueue<Interval> p=new PriorityQueue<>((a,b)->a.end-b.end);
		p.add(intervals[0]);
		for(int i=1;i<intervals.length;i++) {
			Interval curr1=intervals[i];
			Interval  curr2=p.remove();
			if(curr1.start>=curr2.end) {
				curr2.end=curr1.end;
			}
			else {
				p.add(curr1);
			}
			p.add(curr2);
		}
		return p.size();
	}

}
