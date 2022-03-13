class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        HashSet<String> x = new HashSet<>();
        for(int[] blah : dig)
            x.add(blah[0]+","+blah[1]);
        int ans = 0;
        for(int[] art : artifacts){
            boolean check = true;
            for(int i=art[0]; i<=art[2]; i++)
                for(int j=art[1]; j<=art[3]; j++)
                    if(!x.contains(i+","+j))
                        check = false;
            if(check) ans++;
        }
        return ans;
    }
}