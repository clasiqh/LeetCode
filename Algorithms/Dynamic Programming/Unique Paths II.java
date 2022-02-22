class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        for(int i=0;i<dp.length;i++)
            Arrays.fill(dp[i],-1);
                
        return helper(grid,grid.length-1,grid[0].length-1);
    }
    
    int helper(int[][] grid, int i, int j){
        if(i==-1 || j==-1 || grid[i][j]==1)
            return 0;
        if(i==0 && j==0)
            return 1;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        dp[i][j] =  helper(grid,i-1,j) + helper(grid,i,j-1);
        return dp[i][j];
    }
}