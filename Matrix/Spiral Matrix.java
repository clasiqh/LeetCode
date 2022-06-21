class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int up=0, left = 0, down = m-1, right = n-1;
        while(res.size()<m*n){
            for(int i=left; i<=right && res.size()<m*n; i++)
                res.add(matrix[up][i]);
            
            for(int i=up+1; i<down && res.size()<m*n; i++)
                res.add(matrix[i][right]);
            
            for(int i=right; i>left && res.size()<m*n; i--)
                res.add(matrix[down][i]);
            
            for(int i=down; i>up && res.size()<m*n; i--)
                res.add(matrix[i][left]);
            
            left++; up++; right--; down--;
        }
        
        return res;
    }
}