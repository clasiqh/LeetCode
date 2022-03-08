class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
        List<List<Integer>> red = new ArrayList<>();
        List<List<Integer>> blue = new ArrayList<>();
        for(int i = 0; i<n; i++){
            red.add(new ArrayList<Integer>());
            blue.add(new ArrayList<Integer>());
        }
        for(int[] edge : red_edges)
            red.get(edge[0]).add(edge[1]);
        for(int[] edge : blue_edges)
            blue.get(edge[0]).add(edge[1]);
        
        int[] result = new int[n];
        Arrays.fill(result, -1);
        
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});
        q.offer(new int[]{0, 1});
        boolean[][] visited = new boolean[red.size()][2];
        int step = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                int[] curr = q.poll();
                int index = curr[0], color = curr[1];
                visited[index][color] = true;
                if(result[index] == -1 || step < result[index])
                    result[index] = step;
                List<List<Integer>> graph = color==1?red:blue;
                    for(int node : graph.get(index))
                        if(!visited[node][1^color])
                            q.add(new int[]{node, 1^color});
            }
            step++;
        }
        return result;
    }
}
