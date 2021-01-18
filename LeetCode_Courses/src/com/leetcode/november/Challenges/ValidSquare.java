package com.leetcode.november.Challenges;

public class ValidSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int distSq(int[] p, int[] q) {
        return (p[0] - q[0])*(p[0] - q[0]) + (p[1] - q[1])*(p[1] - q[1]);
    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
         if (p1[0] == p2[0] && p1[1] == p2[1]
            || p1[0] == p3[0] && p1[1] == p3[1]
            || p1[0] == p4[0] && p1[1] == p4[1]) 
             return false;
    int d2 = distSq(p1, p2); // from p1 to p2 
    int d3 = distSq(p1, p3); // from p1 to p3 
    int d4 = distSq(p1, p4); // from p1 to p4 
  
    if (d2 == 0 || d3 == 0 || d4 == 0)     
        return false; 
  
  if (d2 == d3 && 2 * d2 == d4) {
            int d = distSq(p2, p4);
            return (d == distSq(p3, p4) && d == d2);
        }
  
        if (d3 == d4 && 2 * d3 == d2) {
            int d = distSq(p2, p3);
            return (d == distSq(p2, p4) && d == d3);
        }
        
        if (d2 == d4 && 2*d2 == d3) {
            int d = distSq(p2, p3);
            return (d == distSq(p3, p4) && d == d2);
        }
     
        return false;
    
    }
}
