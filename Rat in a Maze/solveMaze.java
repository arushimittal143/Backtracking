class Result {
  public static int solveMaze(int maze[][], int size) {
    // Write your code here
    if (maze[0][0]==-1) 
            return 0;
        for (int i = 0; i < size; i++) 
        { 
            if (maze[i][0] == 0) 
                maze[i][0] = 1; 
            else
                break; 
        } 
        for (int i =1 ; i< size ; i++) 
        { 
            if (maze[0][i] == 0) 
                maze[0][i] = 1; 
            else
                break; 
        } 
        for (int i = 1; i < size; i++) 
        { 
            for (int j = 1; j <size ; j++) 
            {  
                if (maze[i][j] == -1) 
                    continue; 
                if (maze[i - 1][j] > 0) 
                    maze[i][j] = (maze[i][j] +  
                                 maze[i - 1][j]); 
                if (maze[i][j - 1] > 0) 
                    maze[i][j] = (maze[i][j] +  
                                  maze[i][j - 1]); 
            } 
        } 
        return (maze[size - 1][size - 1] > 0) ?  maze[size - 1][size - 1] : 0; 
  }
}
