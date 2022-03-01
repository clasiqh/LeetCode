class Solution {

    int[][] grid1, grid2;

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        this.grid1 = grid1;
        this.grid2 = grid2;
        int count = 0;
        for (int i = 0; i < grid2.length; i++)
            for (int j = 0; j < grid2[0].length; j++)
                if (grid2[i][j] == 1 && check(i, j))
                    count++;
        return count;
    }

    boolean check(int i, int j) {
        if (i == -1 || j == -1 || i == grid2.length || j == grid2[0].length || grid2[i][j] == 0)
            return true;
        if (grid1[i][j] != 1)
            return false;
        grid2[i][j] = 0;
        return check(i + 1, j) & check(i - 1, j) & check(i, j + 1) & check(i, j - 1);
    }

}