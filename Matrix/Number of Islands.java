class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    mark(grid, i, j);
                }
            }
        }
        return count;
    }
    
    void mark(char[][] grid, int i, int j){
        if(i==grid.length || i==-1 || j==-1 || j==grid[0].length || grid[i][j]=='0')
            return;
        grid[i][j] = '0';
        mark(grid, i-1,j); mark(grid, i+1,j);
        mark(grid, i,j-1); mark(grid, i,j+1);
    }
}