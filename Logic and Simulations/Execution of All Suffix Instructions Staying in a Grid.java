class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans = new int[s.length()];
        for(int i=0;i<s.length();i++){
            int count = 0;
            int[] curr = {startPos[0], startPos[1]};
            for(int j=i;j<s.length();j++){
                switch(s.charAt(j)){
                    case 'L':
                        curr[1] = curr[1]-1; break;
                    case 'R':
                        curr[1] = curr[1]+1; break;
                    case 'U':
                        curr[0] = curr[0]-1; break;
                    case 'D':
                        curr[0] = curr[0]+1; break;
                }
                if(curr[0]<0||curr[0]==n||curr[1]<0||curr[1]==n)
                    break;
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}