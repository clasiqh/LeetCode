public class Solution {
    public int hammingWeight(int n) {
        int x = 1;
        int count = 0;
        int i=32;
        while(i>0){
            int temp = x&n;
            if(temp==1) count++;
            n=n>>1;
            i--;
        }
        return count;
    }
}