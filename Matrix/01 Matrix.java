class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<int[]> q = new LinkedList<>();
        int m  = mat.length, n = mat[0].length;
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(mat[i][j]==0)
                    q.add(new int[]{i,j});
                else
                    mat[i][j] = Integer.MAX_VALUE;
            }
 
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        
        while(!q.isEmpty()){
            int[] curr = q.poll();
            for(int[] d : dir){
                
                int i = curr[0] + d[0];
                int j = curr[1] + d[1];
                
                if(i==-1||j==-1||i==m||j==n||mat[i][j]<=mat[curr[0]][curr[1]])
                    continue;
                
                mat[i][j] = mat[curr[0]][curr[1]]+1;
                q.add(new int[]{i,j});
            }
        }
        
        return mat;
    }
}