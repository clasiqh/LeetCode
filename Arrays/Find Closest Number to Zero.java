class Solution {
    public int findClosestNumber(int[] nums) {
        int res = nums[0];
        for(int x : nums){
            if(Math.abs(x)<=Math.abs(res))
                res =  Math.abs(x)==Math.abs(res) ? Math.max(res, x) : x;
        }
        return res;
    }
}