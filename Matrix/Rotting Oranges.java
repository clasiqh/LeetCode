class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)
                    q.add(new int[]{i,j});
                else if(grid[i][j]==1)
                    fresh++;
            }
        }
        
        if(q.isEmpty()) return fresh>0?-1:0;
        
        int step = -1;
        while(!q.isEmpty()){
            step++;
            int size = q.size();
            for(int k=0;k<size;k++){
                int[] curr = q.poll();
                int i = curr[0],j = curr[1];
                 
                if(i==-1||j==-1||i==grid.length||j==grid[0].length||grid[i][j]==0||grid[i][j]==3)
                    continue;
                
                if(grid[i][j]==1) fresh--;
                grid[i][j] = 3;
                q.add(new int[]{i+1,j}); q.add(new int[]{i,j+1});
                q.add(new int[]{i-1,j}); q.add(new int[]{i,j-1});
            }
        }
        
        return fresh==0? step-1: -1;
    }
}