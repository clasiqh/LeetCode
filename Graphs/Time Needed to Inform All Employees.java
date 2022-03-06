class Solution {
    List<List<Integer>> graph = new ArrayList<>();
    int max = 0, sum = 0;
    boolean[] visited;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        visited = new boolean[n];
        for(int i=0; i<n; i++)
            graph.add(new ArrayList<>());
        for(int i=0; i<n; i++){
            if(i==headID) continue;
            graph.get(i).add(manager[i]);
            graph.get(manager[i]).add(i);
        }
        
        dfs(headID, informTime);
        return max;
    }
    
    void dfs(int head, int[] time){
        
        if(visited[head]) return;
        visited[head]=true;
        sum+= time[head];
        for(int sub : graph.get(head)){
            dfs(sub, time);
            max = Math.max(max, sum);
        }
        sum-= time[head];
    }
}