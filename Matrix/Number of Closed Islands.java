class Solution {
    int[][] grid;
    public int closedIsland(int[][] grid) {
        int ans = 0;
        this.grid = grid;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]==0 && fill(i,j))
                    ans++;
        return ans;
    }

    boolean fill(int i, int j) {
        if (i == -1 || i == grid.length || j == -1 || j == grid[0].length)
            return false;
        if (grid[i][j] == 1)
            return true;
        grid[i][j] = 1;
        return fill(i + 1, j) & fill(i - 1, j) & fill(i, j + 1) & fill(i, j - 1);
    }
}