package com.leetcode.august.Challenges;

import java.util.HashSet;
import java.util.Set;

public class RobotRoomCleaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public void cleanRoom(Robot robot) {
	       
	        Set<String> set = new HashSet<>();
	        int dir = 0;   // 0: up, 90: right, 180: down, 270: left
	        dfs(robot, set, 0, 0, dir);
	    }
	public void dfs(Robot robot, Set<String> set, int i, int j, int dir) {
		String str=i+","+j;
		if(set.contains(str))
			return;
		robot.clean();
		set.add(str);
		
		for(int n=0;n<4;n++)
		{
			int next_x=i;
			int next_y=j;
			if(robot.move())
			{
				switch (dir) {
				 case 0:
					 
						 next_x=i-1;
						 break;
				 case 90:
				
						 next_y=j+1;
						 break;
				 case 270:
					 
						 next_x=i+1;
						 break;
				 case 360:
					
					 next_y=j-1;
					 break;
				 default:
					 break;
					     
				}
				dfs( robot,  set,next_x,next_y,  dir);
			    robot.turnLeft();
				robot.turnLeft();
    			robot.move();
    			robot.turnRight();
    			robot.turnRight();
						
					
			}
			robot.turnRight();
    		dir += 90;
    		dir %= 360;
		}
		
		
	}

}
