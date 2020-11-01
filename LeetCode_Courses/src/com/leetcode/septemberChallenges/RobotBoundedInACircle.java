package com.leetcode.septemberChallenges;

public class RobotBoundedInACircle {
	 static class Point{
	        int x;
	        int y;
	        Point(int x, int y){
	            this.x=x;
	            this.y=y;
	        }
	    }

	public static void main(String[] args) {
		String instructions="GGLLGG";
		System.out.println(isRobotBounded(instructions));

	}
	
	    public static boolean isRobotBounded(String instructions) {
	        Point point=new Point(0,0);
	        String direction="N";
	        char arr[]=instructions.toCharArray();
	        
	        for(char s:arr){
	            if(s=='G'){
	                if(direction.equals("N")){
	                     
	                    point.y+=1;
	                }
	                 if(direction.equals("E")){
	                      System.out.println("hi2");
	                    point.x+=1;
	                }
	                 if(direction.equals("S")){
	                     
	                    point.y-=1;
	                }
	                 if(direction.equals("W")){
	                    
	                    point.x-=1;
	                }
	            }
	            if(s=='L'){
	                 if(direction.equals("N")){
	                     
	                    direction="W";
	                }
	                 else if(direction.equals("E")){
	                      
	                     direction="N";
	                }
	                 else if(direction.equals("S")){
	                     
	                    direction="E";
	                }
	                 else if(direction.equals("W")){
	                      
	                   direction="S";
	                }
	                
	            }
	             if(s=='R'){
	                 if(direction.equals("N")){
	                    direction="E";
	                }
	                 else if(direction.equals("E")){
	                     direction="S";
	                }
	                else  if(direction.equals("S")){
	                    direction="W";
	                }
	                else if(direction.equals("W")){
	                   direction="N";
	                }
	                
	            }
	        }
	        int finalX=point.x;
	        int finalY=point.y;
	        String finalDir=direction;
	       
	        if(!finalDir.equals("N") ||(finalX==0 && finalY==0))
	            return true;
	        return false;
	        
	    }

}
