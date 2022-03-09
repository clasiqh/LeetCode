class Solution {
    public int shortestPathLength(int[][] graph) {
        if (graph.length == 1)
            return 0;

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++)
            q.add(new int[] { i, 1 << i });

        int steps = 0, end = (1 << graph.length) - 1;
        boolean[][] vis = new boolean[graph.length][end];

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                for (int node : graph[curr[0]]) {
                    int nextState = curr[1] | 1 << node;

                    if (nextState == end)
                        return steps + 1;
                    if (vis[node][nextState])
                        continue;

                    vis[node][nextState] = true;
                    q.add(new int[] { node, nextState });
                }
            }
            steps++;
        }
        return -1;
    }
}