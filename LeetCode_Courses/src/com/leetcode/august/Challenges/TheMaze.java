package com.leetcode.august.Challenges;

public class TheMaze {

	public static void main(String[] args) {
		int[][] maze= {{0,0, 1, 0, 0},
				{0, 0 ,0, 0, 0},
				{0, 0, 0, 1 ,0},
				{1, 1, 0, 1, 1},
				{0 ,0, 0 ,0,0}};
		int[] start= {0,4};
		int[] dest= {3,2};
		System.out.println(hasPath(maze,start,dest));
	}
	public static boolean hasPath(int[][] maze, int[] start, int[] destination) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
      
        return reach(maze, start[0], start[1] , destination, visited);
    }
	private static boolean reach(int[][] maze, int i, int j, int[] dest, boolean[][] visited) {  
		if (i == dest[0] && j == dest[1]) {
        return true;
    }
    if (visited[i][j] == true) {
        return false;
    }
    visited[i][j] = true;
    int[][] dirs = new int[4][2];
    dirs[0] = new int[]{0, 1};
    dirs[1] = new int[]{1, 0};
    dirs[2] = new int[]{0, -1};
    dirs[3] = new int[]{-1, 0};
    for (int k = 0; k < dirs.length; k ++) {
        int x = i, y = j;
        while (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] == 0) {
            x = x + dirs[k][0];
            y = y + dirs[k][1];
        }
        x = x - dirs[k][0];
        y = y - dirs[k][1];
        if (!visited[x][y] && reach(maze, x, y, dest, visited)) {
            return true;
        }
    }
    return false;
    }
	

}
