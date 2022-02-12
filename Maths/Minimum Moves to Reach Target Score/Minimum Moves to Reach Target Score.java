class Solution {
    public int minMoves(int target, int maxDoubles) {
        if(target==1)
            return 0;
        int count = 0;
        while(maxDoubles!=0 && target!=1){
            if(target%2!=0){
                target--;
                count++;
            }
            if(target==1)
                break;
            target/=2;
            count++;
            maxDoubles--;
        }
        
        if(target!=1)
            count+= target-1;
        return count;
    }
}