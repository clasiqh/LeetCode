class Solution {

    Queue<int[]> q = new LinkedList<>();

    public int shortestBridge(int[][] grid) {
        boolean found = false;
        int len = -2, N = grid.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if (grid[i][j] == 1) {
                    dfs(i, j, grid);
                    found = true;
                    break;
                }
            if (found)
                break;
        }

        while (!q.isEmpty()) {
            len++;
            int size = q.size();
            for (int k = 0; k < size; k++) {
                int[] curr = q.poll();
                int x = curr[0], y = curr[1];

                if (x == -1 || y == -1 || x == N || y == N || grid[x][y] == -1)
                    continue;
                if (grid[x][y] == 1)
                    return len;

                grid[x][y] = -1;
                q.add(new int[] { x + 1, y });
                q.add(new int[] { x, y + 1 });
                q.add(new int[] { x - 1, y });
                q.add(new int[] { x, y - 1 });
            }
        }

        return -1;
    }

    void dfs(int x, int y, int[][] grid) {
        if (x == -1 || y == -1 || x == grid.length || y == grid.length || grid[x][y] == 0 || grid[x][y] == 2)
            return;
        grid[x][y] = 2;
        q.add(new int[] { x, y });
        dfs(x, y + 1, grid);
        dfs(x + 1, y, grid);
        dfs(x - 1, y, grid);
        dfs(x, y - 1, grid);
    }
}