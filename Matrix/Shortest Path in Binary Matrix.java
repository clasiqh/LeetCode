class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int len = 0, N = grid.length-1;
        if(grid[0][0]==1||grid[N][N]==1)
            return -1;
        
        Queue<Integer> x = new LinkedList<>();
        q.add(new int[]{0,0});
        
        while(!q.isEmpty()){
            len++;
            int size = q.size();
            for(int k=0; k<size; k++){
                int[] curr = q.poll();
                int i = curr[0], j = curr[1];
                if(i==N+1||j==N+1||i==-1||j==-1||grid[i][j]>0)
                    continue;
                
                if(i==N && j==N)
                    return len;
                
                grid[i][j] = 1;
                q.add(new int[]{i+1, j}); q.add(new int[]{i-1,j});
                q.add(new int[]{i, j+1}); q.add(new int[]{i,j-1});
                q.add(new int[]{i+1, j+1}); q.add(new int[]{i-1,j-1});
                q.add(new int[]{i-1, j+1}); q.add(new int[]{i+1,j-1});
            }
        }
        
        return -1;
    }
}