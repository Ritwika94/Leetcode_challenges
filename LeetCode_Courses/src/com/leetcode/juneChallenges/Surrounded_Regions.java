package com.leetcode.juneChallenges;

public class Surrounded_Regions {

	public static void main(String[] args) {
		char[][] board = {{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}};
		solve(board);
		
	}
	public static void solve(char[][] board) {
        int M=board.length;
        if(M==0)
            return;
        
        int N=board[0].length;
        
        for (int i = 0; i < M; i++) 
        for (int j = 0; j < N; j++) 
            if (board[i][j] == 'O')
                board[i][j] = '-'; 
    
    for (int i = 0; i < M; i++) 
        if (board[i][0] == '-') 
            fillAdjacent(board, i, 0,  
                          '-', 'O',M,N); 
    for (int i = 0; i < M; i++) 
        if (board[i][N - 1] == '-') 
            fillAdjacent(board, i, N - 1, 
                          '-', 'O',M,N); 
    for (int i = 0; i < N; i++)
        if (board[0][i] == '-') 
            fillAdjacent(board, 0, i, 
                          '-', 'O',M,N); 
    for (int i = 0; i < N; i++)  
        if (board[M - 1][i] == '-') 
            fillAdjacent(board, M - 1,  
                          i, '-', 'O',M,N); 
  
    for (int i = 0; i < M; i++) 
        for (int j = 0; j < N; j++) 
            if (board[i][j] == '-') 
                board[i][j] = 'X'; 
    
        
    }
                
     public static  void fillAdjacent(char mat[][], int x,  
                             int y, char prevV,  
                              char newV,int M,int N) 
    { 
        
        if (x < 0 || x >= M || 
            y < 0 || y >= N) 
            return; 
              
        if (mat[x][y] != prevV) 
            return; 
      
        
        mat[x][y] = newV; 
      
        fillAdjacent(mat, x + 1, y,  
                      prevV, newV,M,N); 
        fillAdjacent(mat, x - 1, y,  
                      prevV, newV,M,N); 
        fillAdjacent(mat, x, y + 1,  
                      prevV, newV,M,N); 
        fillAdjacent(mat, x, y - 1,  
                      prevV, newV,M,N); 
    } 
}
