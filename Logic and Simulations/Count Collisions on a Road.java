class Solution {
    public int countCollisions(String directions) {
        char[] x = directions.toCharArray();
        int res = 0, right = 0, left = 0;
        boolean stat = false;
        for(int i=0; i<directions.length(); i++){
            if(x[i]=='S'){
                res += right;
                right = 0;
                stat = true;
            }
            else if(x[i]=='R') right++;
            else if(x[i]=='L'){
                if(right!=0){
                    res+= 2+right-1;
                    right = 0;
                    stat = true;
                }
                else if(stat){
                    res+=1;
                    left = 0;
                }
            }
        }
        
        return res;
    }
}