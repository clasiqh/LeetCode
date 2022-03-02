class Solution {
    public int maxDistance(int[][] grid) {

        int ans = -1, N = grid.length;
        boolean[][] visited = new boolean[N][N];

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (grid[i][j] == 1)
                    q.add(new int[] { i, j });

        if (q.isEmpty() || q.size() == N * N)
            return ans;
        int dist = -1;

        while (!q.isEmpty()) {
            dist++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int x = curr[0], y = curr[1];
                if (x == -1 || y == -1 || x == N || y == N || visited[x][y])
                    continue;

                grid[x][y] = dist;
                visited[x][y] = true;

                q.add(new int[] { x + 1, y });
                q.add(new int[] { x - 1, y });
                q.add(new int[] { x, y + 1 });
                q.add(new int[] { x, y - 1 });
            }
        }

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (grid[i][j] != 1 && grid[i][j] > ans)
                    ans = grid[i][j];

        return ans;
    }
}