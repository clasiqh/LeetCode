class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        for(int i=0; i<32; i++){
            int a = start&1;
            int b = goal&1;
            if(a!=b)
                count++;
            
            start = start>>1;
            goal = goal>>1;
        }
        
        return count;
    }
}