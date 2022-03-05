class Solution {
    List<List<Integer>> graph = new ArrayList<>();
    HashSet<Integer> visited = new HashSet<>();

    int net = 0;

    public int makeConnected(int n, int[][] connections) {

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        for (int[] arr : connections) {
            graph.get(arr[0]).add(arr[1]);
            graph.get(arr[1]).add(arr[0]);
        }

        for (int i = 0; i < n; i++)
            if (!visited.contains(i)) {
                helper(i);
                net++;
            }

        int extra = connections.length - (n - net);
        return extra < net - 1 ? -1 : net - 1;
    }

    void helper(int index) {
        if (visited.contains(index))
            return;
        visited.add(index);
        for (int i : graph.get(index))
            helper(i);
    }
}