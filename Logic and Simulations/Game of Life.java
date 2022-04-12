class Solution {
    public void gameOfLife(int[][] board) {
        int[][] dirs = {{1,1},{-1,1},{1,-1},{-1,-1},{1,0},{0,1},{0,-1},{-1,0}};
        int m = board.length, n = board[0].length;
        int[][] res = new int[m][n];
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++){
                int count = 0;
                for(int[] dir : dirs){
                    int x = dir[0], y = dir[1];
                    if(i+x<0 || i+x>=m || j+y<0 || j+y>=n)
                        continue;
                    else if(board[i+x][j+y]==1) count++;
                }
                
                if(count<2 || count>3) res[i][j] = 0;
                else res[i][j] = count==2 ? board[i][j] : 1;
            }
        
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                board[i][j] = res[i][j];
    }
}