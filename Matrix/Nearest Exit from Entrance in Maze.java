class Solution {
    public int nearestExit(char[][] maze, int[] ent) {
        
        int rows = maze.length, cols = maze[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        
        q.offer(ent); maze[ent[0]][ent[1]] = 'x';
        int steps = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            steps++;
            
            for (int i=0;i<size;i++) {
                int[] curr = q.poll();
                for (int[] dir: dirs) {
                    int x = dir[0]+curr[0];                    
                    int y = dir[1]+curr[1];
                    
                    if (x<0||x>=rows||y<0||y>=cols) continue;
                    if (maze[x][y]=='x' || maze[x][y] == '+') continue;
                    if (x==0||x==rows-1||y==0||y==cols-1) return steps;
                    
                    q.offer(new int[]{x, y});
                    maze[x][y] = 'x';
                }
            }
        }
        
        return -1;
    }
}