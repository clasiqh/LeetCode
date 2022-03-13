class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        int[][] arr = new int[n][n];
        int temp = 0;
        for(int[] art : artifacts){
            temp++;
            for(int i=art[0];i<=art[2];i++)
                for(int j=art[1];j<=art[3];j++)
                    arr[i][j] = temp;
        }
        
        for(int[] dug : dig)
            arr[dug[0]][dug[1]] = -1;
        
        HashSet<Integer> x = new HashSet<>();
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++){
                
                if(arr[i][j]==0 || arr[i][j]==-1 || x.contains(arr[i][j]))
                    continue;
                x.add(arr[i][j]);
            }
        
        return artifacts.length-x.size();
    }
}