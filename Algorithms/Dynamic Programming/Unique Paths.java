class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        return helper(m-1,n-1);
    }

    int helper(int m, int n){
        if(n<0 || m<0)
            return 0;
        if(m==0 || n==0)
            return 1;
        if(dp[m][n]>0)
            return dp[m][n];
        
        dp[m][n] =  helper(m-1, n) + helper(m, n-1);
        return dp[m][n];
    }
}