class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int res = 0, mid = nums[nums.length/2];
        for(int num : nums)
            res += Math.abs(mid-num);
        return res;
    }
}