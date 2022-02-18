class Solution {
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]==1)
                    return mark(grid, i, j);
        return -1;
    }
    
    int mark(int[][] grid, int i, int j){
        if(i==-1 || j==-1 || i==grid.length || j==grid[0].length || grid[i][j]==0)
            return 1;
        if(grid[i][j]==-1) return 0;
        grid[i][j] = -1;
        return mark(grid,i+1,j) + mark(grid,i-1,j) + mark(grid,i,j+1) + mark(grid,i,j-1);
    }
    
}