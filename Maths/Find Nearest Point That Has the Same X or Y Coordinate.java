class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min=-1, dist = Integer.MAX_VALUE;
        for(int i=0; i<points.length; i++)
            if(points[i][0]==x || points[i][1]==y){
                int curr = Math.abs(points[i][0]-x) + Math.abs(points[i][1]-y);
                if(curr<dist){
                    dist = curr;
                    min = i;
                }
            }
        return min;
    }
}