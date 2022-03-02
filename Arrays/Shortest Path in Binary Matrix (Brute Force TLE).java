class Solution {
    int min = Integer.MAX_VALUE, N=0;
    int[][] grid;
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        this.grid = grid; N = grid.length;
        if(grid[N-1][N-1]==1) return -1;
        check(0, 0, 0);
        return min==Integer.MAX_VALUE?-1:min;
    }
    
    
    void check(int i, int j, int len){
        len++;
        if(i==N-1&&j==N-1){
            min = Math.min(min, len);
            return;
        }
        
        if(i==-1||i==N||j==-1||j==N||grid[i][j]==1||len>=min)
            return;
 
        grid[i][j]=1;
        
        check(i+1,j,len); check(i-1,j,len);
        check(i,j+1,len); check(i,j-1,len);
        
        check(i+1,j+1,len); check(i+1,j-1,len);
        check(i-1,j+1,len); check(i-1,j-1,len);
        
        grid[i][j]=0;
    }
    
}