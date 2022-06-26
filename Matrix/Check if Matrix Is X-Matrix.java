class Solution {
    public boolean checkXMatrix(int[][] grid) {
        
        int n = grid.length-1;
        
        for(int i=0; i<n+1; i++)
            for(int j=0; j<n+1; j++){
                if(grid[i][j]==0 && (i==j||i+j==n))
                    return false;
                if(grid[i][j]!=0 && (i!=j&&i+j!=n))
                    return false;
            }
        return true;
    }
}