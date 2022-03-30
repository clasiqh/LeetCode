class Solution {
    public int firstMissingPositive(int[] nums) {
        int N = nums.length;
        for(int i=0; i<N; i++)
            if(nums[i]<=0 || nums[i]>N)
                nums[i] = N+1;
        
        for(int i=0; i<N; i++){
            int curr = Math.abs(nums[i])-1;
            if(curr>=N || nums[curr]<0)
                continue;
            nums[curr] = -nums[curr];
        }
        
        for(int i=0; i<N; i++)
            if(nums[i]>=0)
                return i+1;
        
        return N+1;
    }
}