class Result 
{
// Complete this function to check placing queen at board[row][col] is safe or not by checking current row, left diagonal & right diagonal.
  static boolean isSafe(int board[][], int row, int col, int N) 
  { 
		int i, j; 
        for (i = 0; i < col; i++) 
            if (board[row][i] == 1) 
                return false; 
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
            if (board[i][j] == 1) 
                return false; 
        for (i = row, j = col; j >= 0 && i < N; i++, j--) 
            if (board[i][j] == 1) 
                return false; 
        return true; 
  } 

// Complete this function to solve the problem and save the answers in sol ArrayList as required.
  static boolean solveNQUtil(int board[][], int col, int N, ArrayList<ArrayList<Integer> > sol)
  { 
	if (col == N) 
    { 
      ArrayList<Integer> list=new ArrayList<Integer>();  
      ArrayList<Integer> l=printSolution(board,list,N);
      sol.add(l);
        return true; 
    }
    boolean res = false; 
    for (int i = 0; i < N; i++) 
    {
        if ( isSafe(board, i, col,N) ) 
        { 
            board[i][col] = 1; 
            res = solveNQUtil(board, col + 1,N,sol) || res; 
            board[i][col] = 0;
        } 
    }
    return res; 
  }
 static ArrayList<Integer> printSolution(int board[][],ArrayList<Integer> l,int N) 
{
   for (int i = 0; i < N; i++) 
    { 
        for (int j = 0; j < N; j++)
        {
            if(board[i][j]==1)
            {
              l.add(j);
            }
        }  
    } 
   return l;
} 
}
