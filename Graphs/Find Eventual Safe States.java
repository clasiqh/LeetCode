class Solution {
    HashSet<Integer> visited = new HashSet<>();

    public List<Integer> eventualSafeNodes(int[][] graph) {

        boolean[] safe = new boolean[graph.length];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            safe[i] = dfs(i, graph, safe);
            if (safe[i])
                res.add(i);
        }

        return res;
    }

    boolean dfs(int i, int[][] graph, boolean[] safe) {
        if (visited.contains(i))
            return safe[i];
        visited.add(i);
        if (graph[i].length == 0)
            return true;
        boolean check = true;
        for (int num : graph[i]) {
            if (check == false)
                break;
            safe[num] = dfs(num, graph, safe);
            check = check & safe[num];
        }
        return check;
    }
}