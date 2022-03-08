class Solution {
    boolean[] visited;
    public boolean canReach(int[] arr, int start) {
        visited = new boolean[arr.length];
        return dfs(start, arr);
    }
    
    boolean dfs(int i, int[] arr){
        if(i>arr.length-1 || i<0 || visited[i])
            return false;
        visited[i] = true;
        if(arr[i]==0)
            return true;
        return dfs(i+arr[i], arr) || dfs(i-arr[i], arr);
    }
}