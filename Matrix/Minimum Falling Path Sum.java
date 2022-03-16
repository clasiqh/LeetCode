class Solution {
    int[][] dp, matrix;
    public int minFallingPathSum(int[][] matrix) {

        this.matrix = matrix;
        dp = new int[matrix.length][matrix.length];
        for(int i=0; i<matrix.length; i++)
            Arrays.fill(dp[i], Integer.MIN_VALUE);

        int ans = Integer.MAX_VALUE;
        for(int j=0; j<matrix.length; j++)
            ans = Math.min(ans, helper(0, j));
        return ans;
    }

    int helper(int i, int j){

        if(j==-1|| j== matrix.length)
            return Integer.MAX_VALUE;
        if(i==matrix.length)
            return 0;
        if(dp[i][j] != Integer.MIN_VALUE)
            return dp[i][j];

        int sides = Math.min(helper(i+1, j+1), helper(i+1, j-1));
        dp[i][j] = matrix[i][j] + Math.min(sides, helper(i+1, j));
        return dp[i][j];
    }
}