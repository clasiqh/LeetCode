class Solution {
    int count = 0;
    List<List<int[]>> graph = new ArrayList<>();

    public int minReorder(int n, int[][] connections) {
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        for (int[] arr : connections) {
            graph.get(arr[0]).add(new int[] { arr[1], 1 });
            graph.get(arr[1]).add(new int[] { arr[0], 0 });
        }

        dfs(0, new HashSet<>());
        return count;
    }

    void dfs(int start, HashSet visited) {
        visited.add(start);
        for (int[] arr : graph.get(start))
            if (!visited.contains(arr[0])) {
                if (arr[1] == 1)
                    count++;
                dfs(arr[0], visited);
            }
    }
}