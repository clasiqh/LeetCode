class Solution {
    List<List<Integer>> graph = new ArrayList<>();
    int max = 0, sum = 0;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        for(int i=0; i<n; i++)
            graph.add(new ArrayList<>());
        for(int i=0; i<n; i++){
            if(i==headID) continue;
            graph.get(i).add(manager[i]);
            graph.get(manager[i]).add(i);
        }
        
        dfs(headID, informTime, manager);
        return max;
    }
    
    void dfs(int head, int[] time, int[] manager){
        if(manager[head]==-2) return;
        manager[head]=-2;
        sum+= time[head];
        for(int sub : graph.get(head)){
            dfs(sub, time, manager);
            max = Math.max(max, sum);
        }
        sum-= time[head];
    }
}