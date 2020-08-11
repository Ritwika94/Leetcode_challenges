package com.leetcode.mayChallenges;

public class StraightLineCheck {

	public static void main(String[]args) {
		
		System.out.println(checkStraightLine(new int[][] {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}));

	}
	
public static boolean checkStraightLine(int[][] coordinates) {
	if(coordinates.length==2)
		return true;
	int[] p1=coordinates[1];
	int[] p2=coordinates[0];
	float slope1=calculateSlope(p1,p2);
	
	for(int i=1;i<coordinates.length;i++)
	{
		int[] point1=coordinates[i];
		int[] point2=coordinates[0];
		float slope2=calculateSlope(point1,point2);
		
		if(slope1!=slope2)
			return false;
	}
	
	return true;
        
 }

private static float calculateSlope(int[] p1, int[] p2) {
	if((p2[0] - p1[0])==0) return 0;
	
	return (float)(p2[1] - p1[1])/(p2[0] - p1[0]);
	
}

}
